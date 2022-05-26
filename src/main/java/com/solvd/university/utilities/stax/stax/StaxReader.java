package com.solvd.university.utilities.stax.stax;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxReader {

    private static final Logger LOGGER = LogManager.getLogger(StaxReader.class);

    public static void parceFromFile() {
        boolean bPersonName = false;
        boolean bPersonSurname = false;
        boolean bPersonAge = false;
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance(); //we are creating factory to get streams
            XMLEventReader eventReader =
                    factory.createXMLEventReader(new FileReader("src/main/resources/from.xml"));

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                switch (event.getEventType()) {
                    case XMLStreamConstants.START_ELEMENT:
                        StartElement startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();
                        if (qName.equalsIgnoreCase("persons")) {
                            LOGGER.info("Start Element : student");
                            Iterator<Attribute> attributes = startElement.getAttributes();
                            String rollNo = attributes.next().getValue();
                            LOGGER.info("id : " + rollNo);
                        } else if (qName.equalsIgnoreCase("personName")) {
                            bPersonName = true;
                        } else if (qName.equalsIgnoreCase("personSurname")) {
                            bPersonSurname = true;
                        } else if (qName.equalsIgnoreCase("personAge")) {
                            bPersonAge = true;
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        Characters characters = event.asCharacters();
                        if (bPersonName) {
                            LOGGER.info("Name: " + characters.getData());
                            bPersonName = false;
                        }
                        if (bPersonSurname) {
                            LOGGER.info("Surname: " + characters.getData());
                            bPersonSurname = false;
                        }
                        if (bPersonAge) {
                            LOGGER.info("age: " + characters.getData());
                            bPersonAge = false;
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = event.asEndElement();
                        if (endElement.getName().getLocalPart().equalsIgnoreCase("persons")) {
                            LOGGER.info("-------------------------");
                        }
                        break;
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            LOGGER.error(e);
        }
    }
}
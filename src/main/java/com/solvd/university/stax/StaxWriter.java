package com.solvd.university.stax;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class StaxWriter {

    private static final Logger LOGGER = LogManager.getLogger(StaxWriter.class);

    public static void parceToFile() {
        try {
            StringWriter stringWriter = new StringWriter();

            XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);

            xMLStreamWriter.writeStartDocument();
            xMLStreamWriter.writeStartElement("Persons");
            xMLStreamWriter.writeAttribute("id", "1");


            xMLStreamWriter.writeStartElement("PersonName");
            xMLStreamWriter.writeCharacters("Harry");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("PersonSurname");
            xMLStreamWriter.writeCharacters("Potter");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("PersonAge");
            xMLStreamWriter.writeCharacters("10");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.flush();
            xMLStreamWriter.close();

            String xmlString = stringWriter.getBuffer().toString();

            stringWriter.close();

            saveToFile(xmlString);

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void saveToFile(String xml) {
        File file = new File("src/main/resources/to.xml");
        try {
            FileUtils.writeStringToFile(file, xml);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}




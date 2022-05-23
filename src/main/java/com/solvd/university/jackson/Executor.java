package com.solvd.university.jackson;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.university.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Executor {

    private static final Logger LOGGER = LogManager.getLogger(Executor.class);

    public static void main(String[] args) throws IOException {

        //to Json!
//        createClubWithPlayers();

        //from Json!
//        readFromJson();
    }

    public static void createClubWithPlayers() {
        List<Player> muPlayers = new ArrayList();
        Player playerBruno = new Player("Bruno Fernandes", "Atacking Midfielder", 90.00, new Date("09/08/1994"));
        Player playerJadon = new Player("Jadon Sancho", "Left Winger", 80.00, new Date("03/25/2000"));
        Player playerdeGea = new Player("David de Gea", "GoalKeeper", 15.00, new Date("09/07/1990"));
        Club mu = new Club("Manchester United", "Manchester", "The Red Devils", new GregorianCalendar(1878, 01, 01), 74140, muPlayers);
        muPlayers.add(playerBruno);
        muPlayers.add(playerJadon);
        muPlayers.add(playerdeGea);
        writeToJson(mu);
    }

    public static void writeToJson(Club club) {
        ObjectMapper om = new ObjectMapper();
        File file = new File("src/main/resources/JsonTo.json");
        try {
            if (!file.exists())
                file.createNewFile();
            om.writeValue(file, club);
            LOGGER.info("created!");
        } catch (IOException e) {
            LOGGER.error(e);
        }

    }

    public static void readFromJson() {
        File file = new File("src/main/resources/JsonFrom.json");
        ObjectMapper om = new ObjectMapper();
        DateFormat df = new SimpleDateFormat("yyyy");
        om.setDateFormat(df);
        Club club = new Club();
        try {
            club = om.readValue(file, Club.class);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        LOGGER.info(club);
        List<Player> players = club.getPlayers();
        for (Player element : players) {
            LOGGER.info(element);
        }
    }
}

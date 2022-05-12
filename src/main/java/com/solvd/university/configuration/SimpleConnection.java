package com.solvd.university.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SimpleConnection {

    private static final Logger LOGGER = LogManager.getLogger(SimpleConnection.class);
    private static SimpleConnection instance;


    private SimpleConnection(){
        //let`s try it withoun forname
    }

    public static SimpleConnection newInstance(){
        if (instance == null){
            new SimpleConnection();
        }
        return instance;
    }

    public static Connection getConnection(String url, String uname, String pas){
        try{
            return DriverManager.getConnection(url,uname,pas);
            }catch (SQLException e ) {
                LOGGER.info("there is no connection. enjoy your null");
                LOGGER.error(e);
                return null;
        }
    }
}

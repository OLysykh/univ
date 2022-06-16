package com.solvd.university.patterns.singletons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//lazy initialization
public class LazySingleton {
    private static final Logger LOGGER = LogManager.getLogger(LazySingleton.class);

    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }else{
            LOGGER.info("we have already created instance. use it");
        }
        return instance;
    }

}

package com.solvd.university.configuration;

import java.io.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBatisSqlSessionFactory {

    private static final Logger LOGGER = LogManager.getLogger(MyBatisSqlSessionFactory.class);

    private static SqlSessionFactory instance;

    private MyBatisSqlSessionFactory(){

    }


    public static SqlSessionFactory getSqlSessionFactory() {
        if (instance == null) {
            Reader reader;
            try {
                reader = Resources.getResourceAsReader("mybatis_config.xml");
                instance = new SqlSessionFactoryBuilder().build(reader);
            } catch (IOException e) {
                LOGGER.error(e);
            }
        }
        return instance;
    }

    public static SqlSession openSession() {
           return getSqlSessionFactory().openSession();

    }
}

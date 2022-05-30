package com.solvd.university.configuration;

import java.io.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBatisSqlSession {

    private static final Logger LOGGER = LogManager.getLogger(MyBatisSqlSession.class);

    //
//
    private static SqlSessionFactory instance;

    private MyBatisSqlSession() {

    }

    public static SqlSessionFactory getSqlSessionFactory() {
        if (instance == null) {
            try {

                String resource = "myBaties/mappers/mybatis_config.xml";
                InputStream inputStream = Resources.getResourceAsStream(resource);
                instance =
                        new SqlSessionFactoryBuilder().build(inputStream);
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
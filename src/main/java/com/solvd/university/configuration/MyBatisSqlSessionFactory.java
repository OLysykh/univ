//package com.solvd.university.configuration;
//
//import java.io.*;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.*;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//public class MyBatisSqlSessionFactory {
//
//    private static final Logger LOGGER = LogManager.getLogger(MyBatisSqlSessionFactory.class);
//
//   //
////
////    private static SqlSessionFactory instance;
////
////    private MyBatisSqlSessionFactory() {
////
////    }
////
////
////    public static SqlSessionFactory getSqlSessionFactory() {
////        if (instance == null) {
////            try {
////
////                String resource = "myBaties/mappers/mybatis_config.xml";
////                InputStream inputStream = Resources.getResourceAsStream(resource);
////                instance =
////                        new SqlSessionFactoryBuilder().build(inputStream);
////            } catch (IOException e) {
////                LOGGER.error(e);
////            }
////        }
////        return instance;
////    }
////
////    public static SqlSession openSession() {
////        return getSqlSessionFactory().openSession();
////
////    }
//
//
//
//
//        private static MyBatisSqlSessionFactory factoryInstance;
//    private static SqlSessionFactory factory;
//
//    private MyBatisSqlSessionFactory(String resources){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream(resources);
//            factory = new SqlSessionFactoryBuilder().build(inputStream);
//        } catch (IOException e) {
//            LOGGER.error(e.getMessage());
//        }
//    }
//
//    public static MyBatisSqlSessionFactory newInstance(String resources){
//        if (factoryInstance == null) factoryInstance = new MyBatisSqlSessionFactory(resources);
//        return factoryInstance;
//    }
//
//    public SqlSessionFactory getFactory(){
//        return factory;
//    }
//}

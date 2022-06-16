package com.solvd.university.patterns.daoFactory;


import com.solvd.university.dao.IStudetsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Executor {

    private static final Logger LOGGER = LogManager.getLogger(Executor.class);

    public static void main(String[] args) {
        IStudetsDAO con = ConnectionFactory.getIstudentDAO(DAOTypes.MYBATIS);
        LOGGER.info(con.getStudentByID(1));
        con = ConnectionFactory.getIstudentDAO(DAOTypes.JDBC);
        LOGGER.info(con.getStudentByID(1));
    }


}

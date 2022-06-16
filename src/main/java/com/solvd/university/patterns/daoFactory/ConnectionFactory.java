package com.solvd.university.patterns.daoFactory;

import com.solvd.university.dao.IStudetsDAO;
import com.solvd.university.dao.jdbcMySQLImpl.StudentsDAO;
import com.solvd.university.dao.myBatisImpl.StudentsBatisDAO;

public class ConnectionFactory {

    public static IStudetsDAO getIstudentDAO(DAOTypes type){
        IStudetsDAO toReturn = switch (type) {
            case JDBC -> new StudentsDAO();
            case MYBATIS -> new StudentsBatisDAO();
        };
        return toReturn;
    }
    }


package com.solvd.university.dao.jdbcMySQLImpl;


import com.mysql.cj.jdbc.CallableStatement;
import com.solvd.university.configuration.SimpleConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

abstract public class ForAllDAO {


    private static final Logger LOGGER = LogManager.getLogger(ForAllDAO.class);
    private Statement statement;
    protected ResultSet resultSet;
    private Connection connection;
    private PreparedStatement preparedStatement;

    ResourceBundle resource = ResourceBundle.getBundle("db");
    String url = resource.getString("db.url");
    String username = resource.getString("db.username");
    String password = resource.getString("db.password");

    public Connection getConnection(){
        SimpleConnection.newInstance();
        connection = SimpleConnection.getConnection(url,username,password);
        return connection;
    }

    public PreparedStatement getPreparedStatement(String sqlQuery) throws SQLException {
        return getConnection().prepareStatement(sqlQuery);
    }


    public ResultSet getResultSet(String sqlQuery) throws SQLException {
        getConnection();
        preparedStatement = connection.prepareStatement(sqlQuery);
        resultSet = preparedStatement.executeQuery(sqlQuery);
        return resultSet;
    }
    public void closeAll() {
        if (resultSet != null)
            try {
                resultSet.close();
            } catch (SQLException ignored) {
            }
        if (statement !=  null)
            try {
                statement.close();
            } catch (SQLException ignored){
            }
        if (connection != null)
            try {
                connection.close();
            } catch (SQLException ignored){
            }
    }

}

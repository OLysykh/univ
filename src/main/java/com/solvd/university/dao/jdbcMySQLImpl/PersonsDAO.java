package com.solvd.university.dao.jdbcMySQLImpl;

import com.solvd.university.dao.IPersonsDAO;
import com.solvd.university.models.Persons;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class PersonsDAO extends AbstractDAO implements IPersonsDAO {

    private static final Logger LOGGER = LogManager.getLogger(PersonsDAO.class);

    ResourceBundle resource = ResourceBundle.getBundle("db");
    String url = resource.getString("db.url");
    String username = resource.getString("db.username");
    String password = resource.getString("db.password");

    @Override
    public Persons getPersonByID(long id) {


        Persons person = new Persons();
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            LOGGER.info("we have a connection!");
            PreparedStatement pr = con.prepareStatement("SELECT * FROM persons WHERE id = ? ");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();
            rs.next();
            person.setId(rs.getLong("id"));
            person.setPersonName(rs.getString("personName"));
            person.setPersonSurname(rs.getString("personSurrname"));
            person.setPersonAge(rs.getInt("personAge"));
            LOGGER.info(rs.getFetchSize());
        } catch (Exception e) {
            LOGGER.error(e);
        }

        return person;
    }

    public void savePerson(Persons person) {
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            PreparedStatement pr = con.prepareStatement("INSERT INTO persons (personName,personSurrname,personAge) VALUES (?,?,?); ");
            pr.setString(1, person.getPersonName());
            pr.setString(2, person.getPersonSurname());
            pr.setLong(3, person.getPersonAge());
            pr.execute();
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    public void updatePerson(Persons person) {
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            PreparedStatement pr = con.prepareStatement("UPDATE persons SET personName = ?,personSurrname = ?,personAge = ? WHERE id = ?; ");
            pr.setString(1, person.getPersonName());
            pr.setString(2, person.getPersonSurname());
            pr.setLong(3, person.getPersonAge());
            pr.setLong(4, person.getId());
            pr.executeUpdate();
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    public void removePerson(Persons person) {
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            PreparedStatement pr = con.prepareStatement("DELETE FROM persons WHERE id = ?; ");
            pr.setLong(1, person.getId());
            pr.execute();
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    public List<Persons> getAllPersons() {
        List<Persons> persons = new ArrayList<>();
        try {
            resultSet = getResultSet("SELECT * FROM persons");
            while (resultSet.next()) {
                Persons personToAdd = new Persons();
                personToAdd.setId(resultSet.getLong("id"));
                personToAdd.setPersonName(resultSet.getString("personName"));
                personToAdd.setPersonSurname(resultSet.getString("personSurrname"));
                personToAdd.setPersonAge(resultSet.getInt("personAge"));
                persons.add(personToAdd);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return persons;
    }


////    InputStream inputStream = getClass().getResourceAsStream("/db.properties");
////    Properties p = new Properties();
////    p.load(inputStream);
////    String url = p.getProperty("db.url");
////    String username = p.getProperty("db.username");
////    String password = p.getProperty("db.password");
//    Persons person = new Persons();
//    try{
//       Connection con = DriverManager.getConnection(url);
//        {
//
//            PreparedStatement pr = con.prepareStatement("SELECT * FROM persons WHERE id = 1 ");
////            pr.setLong(1,id);
//            ResultSet rs = pr.executeQuery();
//            System.out.println(rs.getFetchSize());
////            person.setId(rs.getLong("id"));
////            person.setPersonName(rs.getString("personName"));
////            person.setPersonSurname(rs.getString("personSurname"));
////            person.setPersonAge(rs.getInt("personAge"));
//
//        }
//
//
//    } catch (SQLException throwables) {
//        throwables.printStackTrace();
//    }
//    return person;
//        Connection connection = null;
//        PreparedStatement statement = null;
//        Persons person = new Persons();
//
//        try {
//            String sql = "SELECT * FROM persons WHERE id = ?";
//            connection = getConnection();
//            statement = connection.prepareStatement(sql);
//            statement.setLong(1, id);
//            ResultSet rs = statement.executeQuery();
//
//            while (rs.next()) {
//
//                person.setId(rs.getLong("id"));
//                person.setPersonName(rs.getString("personName"));
//                person.setPersonSurname(rs.getString("personSurname"));
//                person.setPersonAge(rs.getInt("personAge"));
//
//
////                long idP = rs.getLong("id");
////                String personName = rs.getString("personName");
////                String personSurname = rs.getString("personSurname");
////                int age = rs.getInt("age");
//
//
//            }
//
//        } catch (SQLException e) {
//
//            System.out.println(e.getMessage());
//
//        } finally {
//
//            try {
//                if (statement != null) {
//                    statement.close();
//                }
//
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//
//        }
//        return person;
//    }
//
//
//
//
//    private Connection getConnection() {
//
//        Connection con = null;
//        try {
//            con = DriverManager.getConnection(url,user,pass);
//            System.out.println("Succes connection");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if (con != null) {
//                try {
//                    con.close();
//                } catch (SQLException e) {
//
//                }
//            }
//        }
//        return con;
//    }


//            Connection connection = null;
//            try {
//                Class.forName("com.mysql.jc.jdbc.Driver");
//                connection = DriverManager.getConnection(url);
//
//            } catch (ClassNotFoundException e) {
//                System.out.println(e.getMessage());
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//
//            return connection;
//        }


}

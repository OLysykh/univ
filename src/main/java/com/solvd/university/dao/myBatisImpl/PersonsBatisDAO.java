package com.solvd.university.dao.myBatisImpl;

import com.solvd.university.configuration.MyBatisSqlSession;
import com.solvd.university.dao.IPersonsDAO;
import com.solvd.university.models.Persons;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class PersonsBatisDAO implements IPersonsDAO {

    private static final Logger LOGGER = LogManager.getLogger(PersonsBatisDAO.class);

    @Override
    public Persons getPersonByID(long id) throws IOException {
        Persons person = new Persons();
        try(SqlSession session = MyBatisSqlSession.openSession()){
            IPersonsDAO iPersonsDAO = session.getMapper(IPersonsDAO.class);
            person = iPersonsDAO.getPersonByID(id);
            LOGGER.info("A person has been gotten by id");
        }
        return person;
    }

    @Override
    public void savePerson(Persons person) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IPersonsDAO iPersonsDAO = session.getMapper(IPersonsDAO.class);
            iPersonsDAO.savePerson(person);
            session.commit();
            LOGGER.info("Person has been saved successfully");
        }
    }




    @Override
    public void updatePerson(Persons person) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IPersonsDAO iPersonsDAO = session.getMapper(IPersonsDAO.class);
            iPersonsDAO.updatePerson(person);
            session.commit();
            LOGGER.info("Person has been updated successfully");
        }
    }

    @Override
    public void removePerson(Persons person) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IPersonsDAO iPersonsDAO = session.getMapper(IPersonsDAO.class);
            iPersonsDAO.removePerson(person);
            session.commit();
            LOGGER.info("Person has been removed successfully");
        }
    }
}

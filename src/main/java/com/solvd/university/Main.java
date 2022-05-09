package com.solvd.university;

import com.solvd.university.dao.IPersonsDAO;
import com.solvd.university.dao.jdbcMySQLImpl.PersonsDAO;
import com.solvd.university.models.Persons;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ResourceBundle;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);




    public static void main(String[] args) throws IOException {

//         trying to get person from db
//        IPersonsDAO personsDAOGet = new PersonsDAO();
//       LOGGER.info(personsDAOGet.getPersonByID(12));

//        // trying to save person to db
//        IPersonsDAO personsDAOSave = new PersonsDAO();
//        Persons personToSave = new Persons("SomeRandom", "Javelin",69);
//        personsDAOSave.savePerson(personToSave);

        //trying to update person in db
//        IPersonsDAO personsDAOUpdate = new PersonsDAO();
//       Persons personToUpdate = new Persons(10, "Stepan", "Chernobayev", 100);
//       personsDAOUpdate.updatePerson(personToUpdate);

        //trying to remove person from db
        IPersonsDAO personsDAORemove = new PersonsDAO();
        Persons personToRemove = new Persons(7);
        personsDAORemove.removePerson(personToRemove);

    }
}

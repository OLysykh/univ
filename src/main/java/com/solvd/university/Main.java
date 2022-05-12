package com.solvd.university;

import com.solvd.university.dao.*;
import com.solvd.university.dao.jdbcMySQLImpl.DayOfWeekDAO;
import com.solvd.university.dao.jdbcMySQLImpl.PersonsDAO;
import com.solvd.university.dao.jdbcMySQLImpl.StudentGroupsDAO;
import com.solvd.university.dao.jdbcMySQLImpl.StudentsDAO;
import com.solvd.university.models.DayOfWeek;
import com.solvd.university.models.Persons;
import com.solvd.university.models.StudentGroups;
import com.solvd.university.models.Students;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);




    public static void main(String[] args) throws IOException {

//         //trying to get person from db
//        IPersonsDAO personsDAOGet = new PersonsDAO();
//       LOGGER.info(personsDAOGet.getPersonByID(12));

//        // trying to save person to db
//        IPersonsDAO personsDAOSave = new PersonsDAO();
//        Persons personToSave = new Persons("SomeRandom", "Javelin",69);
//        personsDAOSave.savePerson(personToSave);

//        //trying to update person in db
//        IPersonsDAO personsDAOUpdate = new PersonsDAO();
//       Persons personToUpdate = new Persons(10, "Stepan", "Chernobayev", 100);
//       personsDAOUpdate.updatePerson(personToUpdate);

        //trying to remove person from db
//        IPersonsDAO personsDAORemove = new PersonsDAO();
//        Persons personToRemove = new Persons(7);
//        personsDAORemove.removePerson(personToRemove);

        //trying to get a List of Persons
//        PersonsDAO personsList = new PersonsDAO();
//        List<Persons> persons;
//        persons = personsList.getAllPersons();
//        for (Persons element : persons){
//            LOGGER.info(element);
//        }



//    //StudentGroupsDAO-------------------------------------------------
//         //trying to get person from db
//        IStudentGroupsDAO iStudentGroupsDAO= new StudentGroupsDAO();
//        LOGGER.info(iStudentGroupsDAO.getStudentGroupByID(2));

                // trying to save person to db
//        IStudentGroupsDAO iStudentGroupsDAO = new StudentGroupsDAO();
//        iStudentGroupsDAO.saveStudentGroup(new StudentGroups(25,7));

//                //trying to update person in db
//        IStudentGroupsDAO iStudentGroupsDAO = new StudentGroupsDAO();
//        iStudentGroupsDAO.updateStudentGroup(new StudentGroups(1,100,4));

//        //trying to remove person from db
//        IStudentGroupsDAO iStudentGroupsDAO = new StudentGroupsDAO();
//        iStudentGroupsDAO.removeStudentGroup(new StudentGroups(3));

        //DayOfWeekDAO-------------------------------------------------
//         //trying to get person from db
//        IDayOfWeekDAO iDayOfWeekDAO = new DayOfWeekDAO();
//        LOGGER.info(iDayOfWeekDAO.getDayOfWeekByID(2).getDayOfWeek());

//        // trying to save person to db
//        IDayOfWeekDAO iDayOfWeekDAO = new DayOfWeekDAO();
//        iDayOfWeekDAO.saveDayOfWeek(new DayOfWeek("Saturday"));

//                //trying to update person in db
//        IDayOfWeekDAO iDayOfWeekDAO = new DayOfWeekDAO();
//        iDayOfWeekDAO.updateDayOfWeek(new DayOfWeek(1, "Thank`s God it`s Friday!"));

//        //        //trying to remove person from db
//        IDayOfWeekDAO iDayOfWeekDAO = new DayOfWeekDAO();
//        iDayOfWeekDAO.removeDayOfWeek(new DayOfWeek(1));

        IStudetsDAO ist = new StudentsDAO();
       LOGGER.info(ist.getStudentByID(1));


    }
}

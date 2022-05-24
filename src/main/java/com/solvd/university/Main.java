package com.solvd.university;

import com.solvd.university.configuration.MyBatisSqlSessionFactory;
import com.solvd.university.dao.*;
import com.solvd.university.dao.jdbcMySQLImpl.*;
import com.solvd.university.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);




    public static void main(String[] args) throws IOException {

IPersonsDAO iPersonsDAO = MyBatisSqlSessionFactory.openSession().getMapper(IPersonsDAO.class);
LOGGER.info(iPersonsDAO.getPersonByID(12));

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
//
//        //        //trying to remove person from db
//        IDayOfWeekDAO iDayOfWeekDAO = new DayOfWeekDAO();
//        iDayOfWeekDAO.removeDayOfWeek(new DayOfWeek(1));
//
//        IStudetsDAO ist = new StudentsDAO();
//       LOGGER.info(ist.getStudentByID(1));
//
//        IStudetsDAO ist = new StudentsDAO();
//        ist.saveStudent(new Students(10,"gryd", 2));

//        IStudetsDAO ist = new StudentsDAO();
//        ist.updateStudent(new Students(10,"HAHAHA"));

//        IStudetsDAO ist = new StudentsDAO();
//        ist.removeStudent(new Students(10));

//        ProfessorsDAO pr =new ProfessorsDAO();
//        List<Professors> result = new ArrayList<>();
//        result = pr.getProfesorsWithNames();
//        for (Professors element:result){
//            System.out.println("name: "+element.getPersonName()+"   personsurname: "+element.getPersonSurname()+"   academicdegree: "+element.getAcademicDegree());
//        }
//
//        StudentsDAO studentsDAO = new StudentsDAO();
//        List<Students> result2 = new ArrayList<>();
//        result2 = studentsDAO.getStudentsWithNames();
//        for (Students element:result2){
//            System.out.println("id: "+element.getPerson_id() + "   name: "+element.getPersonName()+"   surname: "+element.getPersonSurname()+"   studentHouse: "+element.getStudentHouse());
//        }
    }
}

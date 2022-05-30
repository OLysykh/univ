package com.solvd.university;

import com.solvd.university.configuration.MyBatisSqlSession;
//import com.solvd.university.configuration.MyBatisSqlSessionFactory;
import com.solvd.university.dao.*;
import com.solvd.university.dao.myBatisImpl.PersonsBatisDAO;
import com.solvd.university.dao.myBatisImpl.ProfessorsBatisDAO;
import com.solvd.university.dao.myBatisImpl.StudentsBatisDAO;
import com.solvd.university.models.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);


    public static void main(String[] args) throws IOException {

//1st pack

  /*      IPersonsDAO iPersonsDAO = new PersonsBatisDAO();
        LOGGER.info(iPersonsDAO.getPersonByID(12));

        IPersonsDAO iPersonsDAO2 = new PersonsBatisDAO();
        iPersonsDAO2.savePerson(new Persons("Charle", "Leclerc", 24));

        IPersonsDAO iPersonsDAO3 = new PersonsBatisDAO();
        iPersonsDAO3.updatePerson(new Persons(1, "Carlos", "Sainz", 26));

        IPersonsDAO iPersonsDAO4 = new PersonsBatisDAO();
        iPersonsDAO4.removePerson(new Persons(2));
        */

//2nd pack
//       IStudetsDAO ist = new StudentsBatisDAO();
//        LOGGER.info(ist.getStudentByID(1));
//
//        IStudetsDAO ist2 = new StudentsBatisDAO();
//        ist2.saveStudent(new Students(10, "BATIS", 3));
//
//        IStudetsDAO ist3 = new StudentsBatisDAO();
//        ist3.updateStudent(new Students(10, "wowowow"));
//
//        IStudetsDAO ist4 = new StudentsBatisDAO();
//        ist4.removeStudent(new Students(12));

//        IStudetsDAO ist5 = new StudentsBatisDAO();
//  //      LOGGER.info(ist5.getStudentsWithNames());


//3 pack

  /*    IProfessorsDAO ist = new ProfessorsBatisDAO();
        LOGGER.info(ist.getProfessorByID(1));

        IProfessorsDAO ist2 = new ProfessorsBatisDAO();
        ist2.saveProfessor(new Professors(49, 999, "dude"));

        IProfessorsDAO ist3 = new ProfessorsBatisDAO();
        ist3.updateProfessor(new Professors(42,5000));

        IProfessorsDAO ist4 = new ProfessorsBatisDAO();
        ist4.removeProfessor(new Professors(50));
*/


        //        // trying to save person to db
//        IDayOfWeekDAO iDayOfWeekDAO = new DayOfWeekDAO();
//        iDayOfWeekDAO.saveDayOfWeek(new DayOfWeek("Saturday"));


//        IPersonsDAO iPersonsDAO2 = MyBatisSqlSessionFactory.openSession().getMapper(IPersonsDAO.class);
//        Persons personsToUpdate = iPersonsDAO2.getPersonByID(11);
//        personsToUpdate.setPersonName("Test");
//        personsToUpdate.setPersonSurname("NOtTest");
//        personsToUpdate.setPersonAge(12);
//        iPersonsDAO2.updatePerson(personsToUpdate);


//        MyBatisSqlSessionFactory factory = MyBatisSqlSessionFactory.newInstance("myBaties/mappers/mybatis_config.xml");
//        try (SqlSession session = factory.getFactory().openSession()) {
//            IPersonsDAO mapper = session.getMapper(IPersonsDAO.class);
//            LOGGER.info(mapper.getPersonByID(11));
//            mapper.updatePerson(new Persons(11, "whyNo2?", "newSurname", 22));
//            LOGGER.info(mapper.getPersonByID(12));
//            session.commit();
//
//        }


        // __---__---__---__---__---__---__---__---__---__---__---__---__---__---__---__---__---__---__---__

//
//        IPersonsDAO iPersonsDAO = MyBatisSqlSessionFactory.openSession().getMapper(IPersonsDAO.class);
//        iPersonsDAO.savePerson(new Persons("tom", "the cat", 12));

//        IPersonsDAO iPersonsDAO = MyBatisSqlSessionFactory.openSession().getMapper(IPersonsDAO.class);
//        LOGGER.info(iPersonsDAO.removePerson(new Persons(12)));

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
package com.solvd.university.dao.myBatisImpl;

import com.solvd.university.configuration.MyBatisSqlSession;
import com.solvd.university.dao.IPersonsDAO;
import com.solvd.university.dao.IStudetsDAO;
import com.solvd.university.models.Persons;
import com.solvd.university.models.Students;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentsBatisDAO implements IStudetsDAO {

    private static final Logger LOGGER = LogManager.getLogger(StudentsBatisDAO.class);

    @Override
    public Students getStudentByID(long id) {
        Students student = new Students();
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IStudetsDAO iStudetsDAO = session.getMapper(IStudetsDAO.class);
            student = iStudetsDAO.getStudentByID(id);
            LOGGER.info("A student has been gotten by id");
        }
        return student;
    }

    @Override
    public void saveStudent(Students student) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IStudetsDAO iStudetsDAO = session.getMapper(IStudetsDAO.class);
            iStudetsDAO.saveStudent(student);
            session.commit();
            LOGGER.info("Student has been saved successfully");
        }
    }

    @Override
    public void updateStudent(Students student) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IStudetsDAO iStudetsDAO = session.getMapper(IStudetsDAO.class);
            iStudetsDAO.updateStudent(student);
            session.commit();
            LOGGER.info("Student has been updated successfully");
        }
    }

    @Override
    public void removeStudent(Students student) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IStudetsDAO iStudetsDAO = session.getMapper(IStudetsDAO.class);
            iStudetsDAO.removeStudent(student);
            session.commit();
            LOGGER.info("Student has been removed successfully");
        }


    }

    @Override
    public List<Students> getStudentsWithNames() {
        List<Students> list = new ArrayList<>();
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IStudetsDAO iStudetsDAO = session.getMapper(IStudetsDAO.class);
            list = iStudetsDAO.getStudentsWithNames();
            LOGGER.info("A list? has been gotten by id");
        }
        return list;
    }
}


package com.solvd.university.dao.myBatisImpl;

import com.solvd.university.configuration.MyBatisSqlSession;
import com.solvd.university.dao.IProfessorsDAO;
import com.solvd.university.models.Professors;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProfessorsBatisDAO implements IProfessorsDAO {

    private static final Logger LOGGER = LogManager.getLogger(ProfessorsBatisDAO.class);

    @Override
    public Professors getProfessorByID(long id) {
        Professors professor = new Professors();
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IProfessorsDAO iProfessorsDAO = session.getMapper(IProfessorsDAO.class);
            professor = iProfessorsDAO.getProfessorByID(id);
            LOGGER.info("A professor has been gotten by id");
        }
        return professor;
    }

    @Override
    public void saveProfessor(Professors professor) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IProfessorsDAO iProfessorsDAO = session.getMapper(IProfessorsDAO.class);
            iProfessorsDAO.saveProfessor(professor);
            session.commit();
            LOGGER.info("Professor has been saved successfully");
        }
    }

    @Override
    public void updateProfessor(Professors professor) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IProfessorsDAO iProfessorsDAO = session.getMapper(IProfessorsDAO.class);
            iProfessorsDAO.updateProfessor(professor);
            session.commit();
            LOGGER.info("Professor has been updated successfully");
        }
    }

    @Override
    public void removeProfessor(Professors professor) {
        try (SqlSession session = MyBatisSqlSession.openSession()) {
            IProfessorsDAO iProfessorsDAO = session.getMapper(IProfessorsDAO.class);
            iProfessorsDAO.removeProfessor(professor);
            session.commit();
            LOGGER.info("Professor has been removed successfully");
        }


    }


}


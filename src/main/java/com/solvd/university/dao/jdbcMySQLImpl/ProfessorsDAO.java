package com.solvd.university.dao.jdbcMySQLImpl;

import com.solvd.university.dao.IProfessorsDAO;
import com.solvd.university.models.Professors;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorsDAO extends AbstractDAO implements IProfessorsDAO {


    public Professors getProfessorByID(long id) {
        Professors professor = new Professors();
        try{
            getPreparedStatementtoSave("SELECT * FROM professors WHERE id = ?", id);
            resultSet.next();
            professor.setPerson_id(resultSet.getLong("person_id"));
            professor.setSalary(resultSet.getInt("salary"));
            professor.setAcademicDegree(resultSet.getString("salary"));
            professor.setSubject_id(resultSet.getInt("subject_id"));
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            closeAll();
        }return professor;
    }

    public void removeProfessor(Professors professor) {
        try{
            getPreparedStatementtoSave("DELETE FROM professors WHERE id = ?", professor.getId());
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }


    public void updateProfessor(Professors professor) {
        try {
            getPreparedStatementtoSave("UPDATE professors SET salary = ? WHERE id = ?", professor.getId(), professor.getSalary());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    public void saveProfessor(Professors professor) {
        try {
            getPreparedStatementtoSave("INSERT INTO professors (person_id,academicDegree,subject_id) VALUES (?,?,?)",
                    professor.getPerson_id(),professor.getAcademicDegree(), professor.getSubject_id());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    public List<Professors> getProfesorsWithNames(){
        List<Professors> profList  = new ArrayList<>();
        try {
            getResultSet("SELECT professors.academicDegree, persons.personName, persons.personSurrname FROM professors INNER JOIN persons ON professors.person_id = persons.id");
        while (resultSet.next()){
            Professors prof = new Professors();
            prof.setAcademicDegree(resultSet.getString("academicDegree"));
            prof.setPersonName(resultSet.getString("persons.personName"));
            prof.setPersonSurname(resultSet.getString("personSurrname"));
            profList.add(prof);
        }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally{
            closeAll();
        }return profList;
   }
}

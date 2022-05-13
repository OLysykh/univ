package com.solvd.university.dao.jdbcMySQLImpl;

import com.solvd.university.dao.IStudetsDAO;
import com.solvd.university.models.Professors;
import com.solvd.university.models.Students;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO extends AbstractDAO implements IStudetsDAO {

    public Students getStudentByID(long id) {
        Students student = new Students();
        student.setId(id);
        try {
            PreparedStatement pr = getPreparedStatement("SELECT * FROM students WHERE id = ?");
            pr.setLong(1, id);
            resultSet = pr.executeQuery();
            resultSet.next();
            student.setStudentHouse(resultSet.getString("studentHouse"));
            student.setPerson_id(resultSet.getLong("person_id"));
            student.setGroups_id(resultSet.getLong("groups_id"));
            student.setExams_id(resultSet.getLong("exams_id"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return student;
    }

    public void saveStudent(Students student) {
        try {
            getPreparedStatementtoSave("INSERT INTO students (person_id,studentHouse,groups_id) VALUES (?,?,?)",
                    student.getPerson_id(), student.getStudentHouse(), student.getGroups_id());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    public void updateStudent(Students student) {
        try {
            getPreparedStatementtoSave("UPDATE students SET studentHouse = ? WHERE id = ?",
                    student.getId(), student.getStudentHouse());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    public void removeStudent(Students student) {
        try{
            getPreparedStatementtoSave("DELETE FROM students WHERE id = ?", student.getId());
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    public List<Students> getStudentsWithNames(){
        List<Students> stuLists  = new ArrayList<>();
        try{
            getResultSet(" SELECT * FROM students  LEFT JOIN persons on students.person_id = persons.id");
        while (resultSet.next()){
            Students stud = new Students();
            stud.setPerson_id(resultSet.getLong("person_id"));
            stud.setPersonName(resultSet.getString("personName"));
            stud.setPersonName(resultSet.getString("personSurrname"));
            stud.setStudentHouse(resultSet.getString("studentHouse"));
            stuLists.add(stud);
        }
    }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            closeAll();
        }return stuLists;
        }
}

package com.solvd.university.dao.jdbcMySQLImpl;

import com.solvd.university.dao.IStudetsDAO;
import com.solvd.university.models.Students;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentsDAO extends ForAllDAO implements IStudetsDAO {

    public Students getStudentByID(long id) {
        Students student = new Students();
        student.setId(id);
       try{
       PreparedStatement pr = getPreparedStatement("SELECT * FROM students WHERE id = ?");
        pr.setLong(1,id);
        resultSet = pr.executeQuery();
        resultSet.next();
        student.setStudentHouse(resultSet.getString("studentHouse"));
        student.setPerson_id(resultSet.getLong("person_id"));
       }catch (SQLException throwables){
           throwables.printStackTrace();
       }finally {
           closeAll();
       }
       return student;
    }

    public void saveStudent(Students student) {

    }

    public void updateStudent(Students student) {

    }

    public void removeStudent(Students student) {

    }
}

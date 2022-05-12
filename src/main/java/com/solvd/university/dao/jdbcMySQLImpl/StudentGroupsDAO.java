package com.solvd.university.dao.jdbcMySQLImpl;

import com.solvd.university.dao.IStudentGroupsDAO;
import com.solvd.university.models.StudentGroups;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentGroupsDAO extends ForAllDAO implements IStudentGroupsDAO {

    public StudentGroups getStudentGroupByID(long id) {
        StudentGroups studentGroups = new StudentGroups();
        try {
            PreparedStatement pr = getPreparedStatement("SELECT * FROM studentGroups WHERE id = ? ");
            pr.setLong(1,id);
            ResultSet rs = pr.executeQuery();
            rs.next();
            studentGroups.setId(rs.getLong("id"));
            studentGroups.setStudentQuantity(rs.getInt("studentQuantity"));
            studentGroups.setYearOfStudy(rs.getInt("yearOfStudy"));
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            closeAll();
        }
        return studentGroups;
    }

    public void saveStudentGroup(StudentGroups studentGroup) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO studentgroups (studentQuantity, yearOfStudy) VALUES (?,?)");
            pr.setLong(1,studentGroup.getStudentQuantity());
            pr.setLong(2,studentGroup.getYearOfStudy());
            pr.execute();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            closeAll();
        }
    }

    public void updateStudentGroup(StudentGroups studentGroup) {
        try {
            PreparedStatement pr = getPreparedStatement("DELETE FROM studentgroups WHERE id = ?");
            pr.setLong(1,studentGroup.getStudentQuantity());
            pr.setLong(2,studentGroup.getYearOfStudy());
            pr.setLong(3,studentGroup.getId());
            pr.execute();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            closeAll();
        }

    }

    public void removeStudentGroup(StudentGroups studentGroup) {
        try{
            PreparedStatement pr = getPreparedStatement("DELETE FROM studentgroups WHERE id = ?");
            pr.setLong(1,studentGroup.getId());
            pr.execute();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            closeAll();
        }
    }
}

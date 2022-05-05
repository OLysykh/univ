package com.solvd.university.dao;


import com.solvd.university.models.Students;

public interface IStudetsDAO {

    Students getStudentByID(long id);
    void saveStudent(Students student);
    void updateStudent(Students student);
    void removeStudent(Students student);


}

package com.solvd.university.dao;


import com.solvd.university.models.Students;

import java.util.List;

public interface IStudetsDAO {

    Students getStudentByID(long id);
    void saveStudent(Students student);
    void updateStudent(Students student);
    void removeStudent(Students student);
    List<Students> getStudentsWithNames();


}

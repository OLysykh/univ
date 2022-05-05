package com.solvd.university.dao;

import com.solvd.university.models.StudentIdCard;
import com.solvd.university.models.Students;

public interface IStudentIdCardDAO {

    StudentIdCard getStudentByID(long id);
    void saveStudentIdCard(StudentIdCard studentIdCard);
    void updateStudentIdCard(StudentIdCard studentIdCard);
    void removeStudentIdCard(StudentIdCard studentIdCard);
}

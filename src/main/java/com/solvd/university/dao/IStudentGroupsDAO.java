package com.solvd.university.dao;

import com.solvd.university.models.StudentGroups;
import com.solvd.university.models.WandsTypes;

public interface IStudentGroupsDAO {

    StudentGroups getStudentGroupByID(long id);
    void saveStudentGroup(StudentGroups studentGroup);
    void updateStudentGroup(StudentGroups studentGroup);
    void removeStudentGroup(StudentGroups studentGroup);

}

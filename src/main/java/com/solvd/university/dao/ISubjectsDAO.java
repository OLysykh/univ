package com.solvd.university.dao;

import com.solvd.university.models.Subjects;

public interface ISubjectsDAO {

    Subjects getSubjectByID(long id);
    void saveSubject(Subjects subject);
    void updateSubject(Subjects subject);
    void removeSubject(Subjects subject);

}

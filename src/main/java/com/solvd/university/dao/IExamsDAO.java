package com.solvd.university.dao;

import com.solvd.university.models.DayOfWeek;
import com.solvd.university.models.Exams;

public interface IExamsDAO {

    Exams getExamByID(long id);
    void saveExam(Exams exam);
    void updateExam(Exams exam);
    void removeExam(Exams exam);

}

package com.solvd.university.dao;

import com.solvd.university.models.Houses;
import com.solvd.university.models.Lessons;

public interface ILessonsDAO {

    Lessons getLessonByID(long id);
    void saveLesson(Lessons lesson);
    void updateLesson(Lessons lesson);
    void removeLesson(Lessons lesson);
}

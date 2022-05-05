package com.solvd.university.dao;

import com.solvd.university.models.StudentGroups;
import com.solvd.university.models.StudentHasLessons;

public interface IStudentHasLessonsDAO {

    StudentHasLessons getStudentHasLessonByID(long id);
    void saveStudentHasLesson(StudentHasLessons studentHasLesson);
    void updateStudentHasLesson (StudentHasLessons studentHasLesson);
    void removeStudentHasLesson (StudentHasLessons studentHasLesson);

}

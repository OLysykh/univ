package com.solvd.university.models;

import java.util.List;

public class Lessons {
    private long id;
    private int yearOfStudy;
    private int auditoryNumber;
    private List<StudentHasLessons> studentHasLesson;
    private List<Professors> professor;
    private DayOfWeek dayOfWeek;

    public Lessons() {
    }

    public Lessons(long id, int yearOfStudy, int auditoryNumber, List<StudentHasLessons> studentHasLesson, List<Professors> professor, DayOfWeek dayOfWeek) {
        this.id = id;
        this.yearOfStudy = yearOfStudy;
        this.auditoryNumber = auditoryNumber;
        this.studentHasLesson = studentHasLesson;
        this.professor = professor;
        this.dayOfWeek = dayOfWeek;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getAuditoryNumber() {
        return auditoryNumber;
    }

    public void setAuditoryNumber(int auditoryNumber) {
        this.auditoryNumber = auditoryNumber;
    }

    public List<StudentHasLessons> getStudentHasLesson() {
        return studentHasLesson;
    }

    public void setStudentHasLesson(List<StudentHasLessons> studentHasLesson) {
        this.studentHasLesson = studentHasLesson;
    }

    public List<Professors> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professors> professor) {
        this.professor = professor;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

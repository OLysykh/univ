package com.solvd.university.models;

import java.util.List;

public class Subjects {
    private long id;
    private String subjectName;
    private List<Professors> professors;
    private List<Exams> exams;

    public Subjects() {
    }

    public Subjects(long id, String subjectName, List<Professors> professors, List<Exams> exams) {
        this.id = id;
        this.subjectName = subjectName;
        this.professors = professors;
        this.exams = exams;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Professors> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professors> professors) {
        this.professors = professors;
    }

    public List<Exams> getExams() {
        return exams;
    }

    public void setExams(List<Exams> exams) {
        this.exams = exams;
    }
}

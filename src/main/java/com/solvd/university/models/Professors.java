package com.solvd.university.models;

public class Professors extends Persons{
    private long id;
    private long person_id;
    private int salary;
    private String academicDegree;
    private Persons person;
    private Houses house;
    private Exams exam;
    private long subject_id;

    public Professors() {
    }

    public Professors(long id) {
        this.id = id;
    }

    public Professors(long id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public Professors(long person_id, int salary, String academicDegree) {
        this.person_id = person_id;
        this.salary = salary;
        this.academicDegree = academicDegree;
    }

    public Professors(long id, long person_id, int salary, String academicDegree, Persons person, Houses house, Exams exam, long subject_id) {
        this.id = id;
        this.person_id = person_id;
        this.salary = salary;
        this.academicDegree = academicDegree;
        this.person = person;
        this.house = house;
        this.exam = exam;
        this.subject_id = subject_id;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public Persons getPerson() {
        return person;
    }

    public void setPerson(Persons person) {
        this.person = person;
    }

    public Houses getHouse() {
        return house;
    }

    public void setHouse(Houses house) {
        this.house = house;
    }

    public Exams getExam() {
        return exam;
    }

    public void setExam(Exams exam) {
        this.exam = exam;
    }

    public long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(long subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public String toString() {
        return "Professors{" +
                "id=" + id +
                ", person_id=" + person_id +
                ", salary=" + salary +
                ", academicDegree='" + academicDegree + '\'' +
                '}';
    }
}

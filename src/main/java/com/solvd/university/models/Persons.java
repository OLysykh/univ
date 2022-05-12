package com.solvd.university.models;

import java.util.List;

public class Persons  {
    private long id;
    private String personName;
    private String personSurname;
    private long personAge;
    private Professors professor;
    private Students student;
    private List<Persons> personsList;

    public Persons() {
    }

    public Persons(long id) {
        this.id = id;
    }

    public Persons(String personName, String personSurname, long personAge) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.personAge = personAge;
    }

    public Persons(long id, String personName, String personSurname, long personAge) {
        this.id = id;
        this.personName = personName;
        this.personSurname = personSurname;
        this.personAge = personAge;
    }

    public Persons(long id, String personName, String personSurname, long personAge, Professors professor, Students student) {
        this.id = id;
        this.personName = personName;
        this.personSurname = personSurname;
        this.personAge = personAge;
        this.professor = professor;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public long getPersonAge() {
        return personAge;
    }

    public void setPersonAge(long personAge) {
        this.personAge = personAge;
    }

    public Professors getProfessor() {
        return professor;
    }

    public void setProfessor(Professors professor) {
        this.professor = professor;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public List<Persons> getPersonsList() {
        return personsList;
    }

    public void setPersonsList(List<Persons> personsList) {
        this.personsList = personsList;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}

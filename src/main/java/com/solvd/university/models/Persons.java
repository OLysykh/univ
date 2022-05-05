package com.solvd.university.models;

public class Persons  {
    private long id;
    private String personName;
    private String personSurname;
    private long personAge;
    private Professors professor;
    private Students student;

    public long getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public long getPersonAge() {
        return personAge;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public void setPersonAge(long personAge) {
        this.personAge = personAge;
    }
}

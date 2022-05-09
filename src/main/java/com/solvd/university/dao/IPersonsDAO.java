package com.solvd.university.dao;

import com.solvd.university.models.Persons;
import com.solvd.university.models.Professors;

import java.io.IOException;

public interface IPersonsDAO {
Persons getPersonByID(long id) throws IOException;
void savePerson(Persons person);
void updatePerson(Persons person);
void removePerson(Persons person);

}

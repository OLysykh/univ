package com.solvd.university.dao;

import com.solvd.university.models.Persons;
import com.solvd.university.models.Professors;

public interface IPersonsDAO {
Persons getPersonByID(long id);
void savePerson(Persons person);
void updatePerson(Persons person);
void removePerson(Persons person);

}

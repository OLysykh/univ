package com.solvd.university.dao;

import com.solvd.university.models.Professors;
import com.solvd.university.models.StudentCharacteristics;

public interface IStudentCharacteristics {

    StudentCharacteristics getStudentCharacteristicByID(long id);
    void saveStudentCharacteristic(StudentCharacteristics studentCharacteristic);
    void updateStudentCharacteristic(StudentCharacteristics studentCharacteristic);
    void removeStudentCharacteristic(StudentCharacteristics studentCharacteristic);

}

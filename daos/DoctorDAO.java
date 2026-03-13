package org.example.daos;

import org.example.models.Doctor;

import java.util.List;

public interface DoctorDAO {
    void addDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();


    void insertDoctor(Doctor doctor);
}
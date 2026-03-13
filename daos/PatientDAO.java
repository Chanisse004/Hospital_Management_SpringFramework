package org.example.daos;

import org.example.models.Patient;

import java.util.List;

public interface PatientDAO {
    void addPatient(Patient patient);
    List<Patient> getAllPatients();

    void insertPatient(Patient patient);
}

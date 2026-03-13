package org.example.daos;

import org.example.models.MedicalRecord;

import java.util.List;

public interface MedicalRecordDAO {
    void addMedicalRecord(MedicalRecord record);
    List<MedicalRecord> getMedicalRecordsByPatient(int patientId);

    void addRecord(MedicalRecord record);
}

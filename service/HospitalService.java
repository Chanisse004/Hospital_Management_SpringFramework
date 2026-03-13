package org.example.service;


import org.example.daos.AppointmentDAO;
import org.example.daos.DoctorDAO;
import org.example.daos.MedicalRecordDAO;
import org.example.daos.PatientDAO;
import org.example.models.Appointment;
import org.example.models.Doctor;
import org.example.models.MedicalRecord;
import org.example.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class HospitalService {

    @Autowired
    private DoctorDAO doctorDAO;

    @Autowired
    private PatientDAO patientDAO;

    @Autowired
    private AppointmentDAO appointmentDAO;

    @Autowired
    private MedicalRecordDAO medicalRecordDAO;

    public void saveDoctor(Doctor doctor) throws SQLException { doctorDAO.insertDoctor(doctor); }
    public void savePatient(Patient patient) throws SQLException { patientDAO.insertPatient(patient); }
    public void saveAppointment(Appointment appointment) throws SQLException { appointmentDAO.createAppointment(appointment); }
    public void saveMedicalRecord(MedicalRecord record) throws SQLException { medicalRecordDAO.addRecord(record); }
}
package org.example;

import org.example.models.Appointment;
import org.example.models.Doctor;
import org.example.models.MedicalRecord;
import org.example.models.Patient;
import org.example.service.HospitalService;
import org.example.util.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            HospitalService service = context.getBean(HospitalService.class);


            service.saveDoctor(new Doctor("clesence", "denyse", "Cardiology", "0781111111", "john@hospital.com"));
            service.saveDoctor(new Doctor("umukundwa", "divin", "Pediatrics", "0782222222", "sarah@hospital.com"));


            service.savePatient(new Patient("joyce", "daddy", "2000-05-10", "Female", "0783333333", "alice@email.com"));
            service.savePatient(new Patient("keke", "muhoza", "1998-08-21", "Male", "0784444444", "david@email.com"));

            System.out.println("Sample data inserted successfully.");


            service.saveAppointment(new Appointment(1, 1, "2026-03-20 10:00:00", "Scheduled"));
            service.saveAppointment(new Appointment(2, 2, "2026-03-21 11:00:00", "Scheduled"));


            service.saveMedicalRecord(new MedicalRecord(1, "Malaria", "Medication", 1));
            service.saveMedicalRecord(new MedicalRecord(2, "Flu", "Rest and medicine", 2));

            System.out.println("Appointments & Medical Records inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }}

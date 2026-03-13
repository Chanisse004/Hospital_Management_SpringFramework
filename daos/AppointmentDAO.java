package org.example.daos;

import org.example.models.Appointment;

import java.util.List;

public interface AppointmentDAO {
    void addAppointment(Appointment appointment);
    void updateStatus(int appointmentId, String status);
    List<Appointment> getAppointmentsByDoctor(int doctorId);
    List<Appointment> getAllAppointments();

    void createAppointment(Appointment appointment);
}


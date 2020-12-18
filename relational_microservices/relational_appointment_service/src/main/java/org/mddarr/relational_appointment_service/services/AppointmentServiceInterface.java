package org.mddarr.relational_appointment_service.services;

import org.mddarr.relational_appointment_service.models.Appointment;

import java.util.List;

public interface AppointmentServiceInterface {

    List<Appointment> getAppointments();

}

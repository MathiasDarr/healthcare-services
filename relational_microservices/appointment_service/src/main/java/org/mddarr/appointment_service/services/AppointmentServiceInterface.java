package org.mddarr.appointment_service.services;

import org.mddarr.appointment_service.models.Appointment;
import org.mddarr.appointment_service.models.reqests.AppointmentRequest;

import java.util.List;

public interface AppointmentServiceInterface {

    List<Appointment> getAppointments();

    List<Appointment> getPatientAppointments(String patient_id);

    List<Appointment> getProviderAppointments(String provider_id);

    String postAppointment(AppointmentRequest appointmentRequest, String patient_id);

    void deleteAppointment(String appointment_id);

}

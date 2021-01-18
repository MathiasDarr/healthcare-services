package org.mddarr.appointment.service.services;


import org.mddarr.appointment.service.models.Appointment;
import org.mddarr.appointment.service.models.requests.AppointmentRequest;

import java.util.List;

public interface AppointmentServiceInterface {

    List<Appointment> getAppointments();

    List<Appointment> getPatientAppointments(String patient_id);

    List<Appointment> getProviderAppointments(String provider_id);

    String postAppointment(AppointmentRequest appointmentRequest, String patient_id);

    void deleteAppointment(String appointment_id);

}

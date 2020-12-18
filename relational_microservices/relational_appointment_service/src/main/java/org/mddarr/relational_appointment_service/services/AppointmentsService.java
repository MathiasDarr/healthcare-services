package org.mddarr.relational_appointment_service.services;


import org.mddarr.relational_appointment_service.models.Appointment;
import org.mddarr.relational_appointment_service.repositories.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentsService implements AppointmentServiceInterface {

    private final AppointmentRepository appointmentsRepository;

    public AppointmentsService(AppointmentRepository appointmentsRepository){
        this.appointmentsRepository = appointmentsRepository;
    }

    @Override
    public List<Appointment> getAppointments() {
        return appointmentsRepository.findAll();
    }
}

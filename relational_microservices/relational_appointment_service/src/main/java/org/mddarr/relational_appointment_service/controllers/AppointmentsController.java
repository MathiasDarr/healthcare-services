package org.mddarr.relational_appointment_service.controllers;


import org.mddarr.relational_appointment_service.models.Appointment;
import org.mddarr.relational_appointment_service.services.AppointmentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentsController {

    private final AppointmentsService appointmentsService;

    public AppointmentsController(AppointmentsService appointmentsService){
        this.appointmentsService = appointmentsService;
    }

    @GetMapping(value = "appointments")
    public List<Appointment> getAppointments(){
        return appointmentsService.getAppointments();
    }
}

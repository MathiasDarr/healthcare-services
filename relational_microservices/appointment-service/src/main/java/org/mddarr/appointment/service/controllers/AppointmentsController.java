package org.mddarr.appointment.service.controllers;


import org.mddarr.appointment.service.models.Appointment;
import org.mddarr.appointment.service.models.requests.AppointmentRequest;
import org.mddarr.appointment.service.services.AppointmentsService;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
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

    @GetMapping(value = "appointments/{patient_id}")
    public List<Appointment> getAppointments(@PathVariable String patient_id){
        return appointmentsService.getPatientAppointments(patient_id);
    }

    @PutMapping(value = "appointments")
    public String postAppointment(@RequestBody AppointmentRequest appointmentRequest) {
        String patient_id = "54703348-02ec-4d2d-a6d5-722002d6f0f1";
        String appointment_id = appointmentsService.postAppointment(appointmentRequest, patient_id);
        return appointment_id;
    }

    @DeleteMapping(value="appointments/{appointment_id}")
    public void deleteAppointment(@PathVariable String appointment_id){
        appointmentsService.deleteAppointment(appointment_id);
    }

}

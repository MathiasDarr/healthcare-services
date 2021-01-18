package org.mddarr.appointment.service.controllers;


import org.mddarr.appointment.service.models.Patient;
import org.mddarr.appointment.service.models.requests.PostPatientRequest;
import org.mddarr.appointment.service.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientsController {

    private final PatientService patientService;

    public PatientsController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping(value ="patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }

    @GetMapping(value="patients/{patient_id}")
    public Optional<Patient> getPatientDetail(@PathVariable String patient_id){
        return patientService.getPatientDetail(patient_id);
    }

    @PutMapping(value="patients")
    public String createPatient(@RequestBody PostPatientRequest postPatientRequest){
        return patientService.postPatient(postPatientRequest);
    }
}

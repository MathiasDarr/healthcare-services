package org.mddarr.user.auth.service.controllers;


import org.mddarr.user.auth.service.models.Patient;
import org.mddarr.user.auth.service.models.requests.PostPatientRequest;
import org.mddarr.user.auth.service.services.PatientService;
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

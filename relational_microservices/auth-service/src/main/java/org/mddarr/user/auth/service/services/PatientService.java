package org.mddarr.user.auth.service.services;


import org.mddarr.user.auth.service.models.Patient;
import org.mddarr.user.auth.service.models.requests.PostPatientRequest;
import org.mddarr.user.auth.service.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientService implements PatientServiceInterface {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getPatientDetail(String id){
        return patientRepository.findById(id);
    }

    @Override
    public String postPatient(PostPatientRequest postPatientRequest) {
        Patient patient = new Patient();
        String patient_id = UUID.randomUUID().toString();
        patient.setPatient_id(patient_id);
        patient.setAge(postPatientRequest.getAge());
        patient.setLast_name(postPatientRequest.getLast_name());
        patient.setFirst_name(postPatientRequest.getFirst_name());
        patientRepository.save(patient);
        return patient_id;
    }
}

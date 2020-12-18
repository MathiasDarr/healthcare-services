package org.mddarr.relation_patient_service.services;

import org.mddarr.relation_patient_service.models.Patient;
import org.mddarr.relation_patient_service.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientDetail(String id){
        return patientRepository.findById(id);
    }


}

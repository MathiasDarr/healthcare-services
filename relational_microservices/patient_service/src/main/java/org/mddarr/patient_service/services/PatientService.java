package org.mddarr.patient_service.services;

import org.mddarr.patient_service.models.Patient;
import org.mddarr.patient_service.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements PatientServiceInterface{

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
}

package org.mddarr.patient_service.services;

import org.mddarr.patient_service.models.Patient;
import org.mddarr.patient_service.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

public interface PatientServiceInterface {

    List<Patient> getPatients();
    Optional<Patient> getPatientDetail(String id);
}
package org.mddarr.appointment.service.services;



import org.mddarr.appointment.service.models.Patient;
import org.mddarr.appointment.service.models.requests.PostPatientRequest;

import java.util.List;
import java.util.Optional;

public interface PatientServiceInterface {

    List<Patient> getPatients();
    Optional<Patient> getPatientDetail(String id);
    String postPatient(PostPatientRequest postPatientRequest);
}
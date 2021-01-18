package org.mddarr.user.auth.service.services;



import org.mddarr.user.auth.service.models.Patient;
import org.mddarr.user.auth.service.models.requests.PostPatientRequest;

import java.util.List;
import java.util.Optional;

public interface PatientServiceInterface {

    List<Patient> getPatients();
    Optional<Patient> getPatientDetail(String id);
    String postPatient(PostPatientRequest postPatientRequest);
}
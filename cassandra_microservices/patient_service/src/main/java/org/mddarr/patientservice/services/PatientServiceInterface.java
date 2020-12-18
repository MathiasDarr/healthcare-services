package org.mddarr.patientservice.services;

import org.mddarr.patientservice.dto.PostPatientRequest;
import org.mddarr.patientservice.models.Patient;

import java.util.List;

public interface PatientServiceInterface {

    List<Patient> getPatients();

    Patient getPatientDetail(String patient_id);

    String postPatient(PostPatientRequest postPatientRequest);

}

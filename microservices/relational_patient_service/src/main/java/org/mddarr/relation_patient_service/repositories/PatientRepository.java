package org.mddarr.relation_patient_service.repositories;

import org.mddarr.relation_patient_service.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
}

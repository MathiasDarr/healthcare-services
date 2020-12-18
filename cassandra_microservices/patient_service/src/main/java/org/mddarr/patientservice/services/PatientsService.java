package org.mddarr.patientservice.services;

import com.datastax.driver.core.PreparedStatement;
import org.mddarr.patientservice.dto.PostPatientRequest;
import org.mddarr.patientservice.models.Patient;
import org.mddarr.patientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PatientsService implements PatientServiceInterface {

    private final CassandraOperations cassandraTemplate;
    private final PatientRepository patientRepository;

    public PatientsService(PatientRepository patientRepository, CassandraOperations cassandraTemplate){
        this.patientRepository = patientRepository;
        this.cassandraTemplate = cassandraTemplate;
    }

    @Override
    public List<Patient> getPatients(){
        /*
        Returns a list of all Patients in the database
         */
        return patientRepository.findAllPatients();
    }

    @Override
    public Patient getPatientDetail(String patient_id){
        /*
        This method returns a Patient object from the provided patient_id
         */
        return patientRepository.getPatientById(patient_id);
    }

    @Override
    public String postPatient(PostPatientRequest postPatientRequest){
        /*
        This method adds a new patient to the patients table.  This method uses the cassandraTemplate to insert a new item
         */
        String patient_id = UUID.randomUUID().toString();
        Patient javaBook = new Patient(patient_id, postPatientRequest.getFirst_name(), postPatientRequest.getLast_name());
        cassandraTemplate.insert(javaBook);
        return patient_id;
    }

    public String createNewPatient(PostPatientRequest postPatientRequest){
        /*
        This method adds a new patient to the patients table.
        This method does the same thing as postPatient but instead demonstates using a CSQL native query from the repository
         */
        String patient_id = UUID.randomUUID().toString();
        patientRepository.createNewPatient(patient_id, postPatientRequest.getFirst_name(), postPatientRequest.getLast_name());
        return patient_id;
    }

}

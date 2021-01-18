package org.mddarr.appointment.service.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.appointment.service.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PatientRepositoryIntegrationTests {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void test_save_and_get_patient_by_id() {
        Patient patient = new Patient();
        final String patientid = UUID.randomUUID().toString();
        patient.setPatientid(patientid);
        patient.setFirst_name("Donald");
        patient.setLast_name("Gabh");
        patient.setAge(29);

        Patient patient2 = new Patient();
        final String patientid2 = UUID.randomUUID().toString();
        patient2.setPatientid(patientid2);
        patient2.setFirst_name("Jonas");
        patient2.setLast_name("Gooor");
        patient2.setAge(39);

        patientRepository.save(patient);
        patientRepository.save(patient2);

        List<Patient> allProviders = patientRepository.findAll();

        assertThat(allProviders).isNotEmpty();

        Optional<Patient> optionalPatient = patientRepository.findById(patientid);
        Assertions.assertTrue(optionalPatient.isPresent());
        Patient foundProvider = optionalPatient.get();

        Optional<Patient> optionalPatient2 = patientRepository.findById(patientid2);
        Assertions.assertTrue(optionalPatient2.isPresent());
        Patient foundProvider2 = optionalPatient2.get();

        Assertions.assertEquals(patient, foundProvider);
        Assertions.assertEquals(patient2, foundProvider2);

    }

}

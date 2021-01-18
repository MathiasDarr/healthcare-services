package org.mddarr.appointment.service.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.appointment.service.models.requests.PostPatientRequest;
import org.mddarr.appointment.service.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PatientServiceTests {

    @MockBean
    PatientRepository patientRepository;

    @Autowired
    PatientService patientService;

    @Test
    void testPostPatient(){
        String first_name = "Charles";
        String last_name = "Woodson";
        Integer age = 22;

        PostPatientRequest postPatientRequest = new PostPatientRequest();
        postPatientRequest.setFirst_name(first_name);
        postPatientRequest.setLast_name(last_name);
        postPatientRequest.setAge(age);
        patientService.postPatient(postPatientRequest);
    }

}

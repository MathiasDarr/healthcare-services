package org.mddarr.user.auth.service.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.user.auth.service.models.Provider;
import org.mddarr.user.auth.service.models.requests.PostPatientRequest;
import org.mddarr.user.auth.service.models.requests.PostProviderRequest;
import org.mddarr.user.auth.service.repositories.PatientRepository;
import org.mddarr.user.auth.service.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

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

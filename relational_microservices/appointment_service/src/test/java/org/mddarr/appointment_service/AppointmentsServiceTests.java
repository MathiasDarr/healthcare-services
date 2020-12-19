package org.mddarr.appointment_service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.appointment_service.repositories.AppointmentRepository;
import org.mddarr.appointment_service.repositories.PatientRepository;
import org.mddarr.appointment_service.repositories.ProviderRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AppointmentsServiceTests {

    @MockBean
    private AppointmentRepository appointmentRepository;

    @MockBean
    private PatientRepository patientRepository;

    @MockBean
    ProviderRepository providerRepository;

    @Test
    public void contextLoads(){

    }

}

package org.mddarr.appointment_service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.appointment_service.models.Patient;
import org.mddarr.appointment_service.repositories.AppointmentRepository;
import org.mddarr.appointment_service.repositories.PatientRepository;
import org.mddarr.appointment_service.repositories.ProviderRepository;
import org.mddarr.appointment_service.services.AppointmentServiceInterface;
import org.mddarr.appointment_service.services.AppointmentsService;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AppointmentsRepositoryTests {

//    @MockBean
//    private AppointmentRepository appointmentRepository;
//
//    @MockBean
//    private PatientRepository patientRepository;
//
//    @MockBean
//    ProviderRepository providerRepository;
//
//    @TestConfiguration
//    static class AppointmentServiceTestContextConfiguration{
//
//        @Bean
//        public AppointmentServiceInterface appointmentService(){
//            return new AppointmentsService();
//        }
//    }
//
//    @BeforeEach
//    public void setUp(){
//        Patient patient = new Patient();
//        String patient_id = UUID.randomUUID().toString();
//        patient.setPatient_id(patient_id);
//        patient.setAge(12);
//        patient.setFirst_name("Alex");
//        patient.setLast_name("Jones");
//        patientRepository.save(patient);
//    }


//    @Test
//    public void  test_get_all_appointments(){
//        appointmentService
//    }


    @Test
    public void test_post_appointment(){

    }


}

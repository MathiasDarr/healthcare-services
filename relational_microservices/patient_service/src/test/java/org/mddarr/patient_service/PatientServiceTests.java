package org.mddarr.patient_service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.patient_service.repositories.PatientRepository;
import org.mddarr.patient_service.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class PatientServiceTests {

	@Autowired
	PatientRepository patientRepository;

	@Test
	void contextLoads() {
	}

}

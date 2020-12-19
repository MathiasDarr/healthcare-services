package org.mddarr.provider_service;

import org.junit.jupiter.api.Test;
import org.mddarr.provider_service.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProviderServiceTests {


	@Autowired
	ProviderRepository providerRepository;

	@Test
	void contextLoads() {
	}

}

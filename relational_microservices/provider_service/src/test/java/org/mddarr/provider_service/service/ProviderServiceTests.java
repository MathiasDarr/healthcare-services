package org.mddarr.provider_service.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.provider_service.models.Provider;
import org.mddarr.provider_service.models.requests.PostProviderRequest;
import org.mddarr.provider_service.repositories.ProviderRepository;
import org.mddarr.provider_service.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.UUID;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ProviderServiceTests {


	@MockBean
	ProviderRepository providerRepository;

	@Autowired
	ProviderService providerService;

	@Test
	void testPostPatient(){
		String first_name = "Charles";
		String last_name = "Woodson";
		String department = "Rheumatology";

		PostProviderRequest postProviderRequest = new PostProviderRequest();
		postProviderRequest.setDepartment(department);
		postProviderRequest.setFirst_name(first_name);
		postProviderRequest.setLast_name(last_name);
		providerService.postProvider(postProviderRequest);
	}

	@Test
	void contextLoads() {
		List<Provider> providers = providerService.getProviders();
		System.out.println("THE LENGTH OF THE PROVIDERS IS " + providers.size());
	}

}

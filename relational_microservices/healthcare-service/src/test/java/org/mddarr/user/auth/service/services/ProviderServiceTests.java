package org.mddarr.user.auth.service.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mddarr.user.auth.service.models.Provider;
import org.mddarr.user.auth.service.models.requests.PostProviderRequest;
import org.mddarr.user.auth.service.repositories.ProviderRepository;
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
		String title = "Neurology";

		PostProviderRequest postProviderRequest = new PostProviderRequest();
		postProviderRequest.setDepartment(department);
		postProviderRequest.setFirst_name(first_name);
		postProviderRequest.setLast_name(last_name);
		postProviderRequest.setTitle(title);
		providerService.postProvider(postProviderRequest);
	}

	@Test
	void contextLoads() {
		List<Provider> providers = providerService.getProviders();
		System.out.println("THE LENGTH OF THE PROVIDERS IS " + providers.size());
	}

}

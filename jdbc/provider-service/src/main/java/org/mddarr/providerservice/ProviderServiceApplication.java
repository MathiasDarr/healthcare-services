package org.mddarr.providerservice;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceApplication.class, args);
	}


	@Bean
	ApplicationRunner applicationRunner(ProviderRepository providerRepository){
		return args ->{
			Provider provider1 = Provider.create("Zuk", "Edward", "Nurse", "Orthopedics");
			Provider provider2 = Provider.create("Charles", "Dubin", "Nurse","Family Medicine");

			Iterable<Provider> providerIterable = providerRepository.findAll();
			providerIterable.forEach(provider ->{
				System.out.println("The providers name is " + provider.getFirst_name());
			});


//			System.out.println(providerRepository.save(provider1));
//			System.out.println(providerRepository.save(provider2));
//			System.out.println(providerRepository.findByFirstName("Zuk"));
		};
	}

}

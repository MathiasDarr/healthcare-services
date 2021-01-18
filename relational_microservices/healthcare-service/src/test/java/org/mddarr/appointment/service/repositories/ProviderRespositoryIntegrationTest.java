package org.mddarr.appointment.service.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.appointment.service.models.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProviderRespositoryIntegrationTest {

    @Autowired
    private ProviderRepository providerRepository;

    @Test
    public void test_save_and_get_provider_by_id() {
        Provider provider = new Provider();
        final String providerid1 = UUID.randomUUID().toString();
        provider.setProviderid(providerid1);
        provider.setFirst_name("Charles");
        provider.setLast_name("Goodwin");
        provider.setDepartment("Neurology");
        provider.setTitle("Nurse");

        Provider provider2 = new Provider();
        final String providerid2 = UUID.randomUUID().toString();
        provider2.setProviderid(providerid2);
        provider2.setFirst_name("Erik");
        provider2.setLast_name("Doah");
        provider2.setDepartment("Oncology");
        provider2.setTitle("Doctor");

        providerRepository.save(provider);
        providerRepository.save(provider2);

        List<Provider> allProviders = providerRepository.findAll();

        assertThat(allProviders).isNotEmpty();

        Optional<Provider> optionalProvider = providerRepository.findById(providerid1);
        Assertions.assertTrue(optionalProvider.isPresent());
        Provider foundProvider = optionalProvider.get();

        Optional<Provider> optionalProvider2 = providerRepository.findById(providerid2);
        Assertions.assertTrue(optionalProvider2.isPresent());
        Provider foundProvider2 = optionalProvider2.get();

        Assertions.assertEquals(provider, foundProvider);
        Assertions.assertEquals(provider2, foundProvider2);

    }

}

package org.mddarr.relational_provider_service.services;

import org.mddarr.relational_provider_service.models.Provider;
import org.mddarr.relational_provider_service.repositories.ProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository patientRepository){
        this.providerRepository = patientRepository;
    }

    public List<Provider> getProviders() {
        return providerRepository.findAll();
    }

    public Optional<Provider> getProviderDetail(String id){
        return providerRepository.findById(id);
    }

    public List<Provider> getProvidersByDepartment(String department){
        return providerRepository.getProvidersByDepartment(department);
    }

}

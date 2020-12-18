package org.mddarr.providerservice.services;

import org.mddarr.providerservice.models.Provider;
import org.mddarr.providerservice.repository.ProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService implements ProviderServiceInterface {

    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository patientRepository){
        this.providerRepository = patientRepository;
    }

    @Override
    public List<Provider> getProviders(){
        return providerRepository.findAllProviders();
    }

    @Override
    public List<Provider> getProvidersByDepartment(String department){
        return providerRepository.findAllProvidersByDepartment(department);
    }

}

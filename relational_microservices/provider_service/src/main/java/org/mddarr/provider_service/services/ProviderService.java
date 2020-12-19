package org.mddarr.provider_service.services;

import org.mddarr.provider_service.models.Provider;
import org.mddarr.provider_service.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProviderService implements ProviderServiceInterface {

    @Autowired
    ProviderRepository providerRepository;

    @Override
    public List<Provider> getProviders() {
        return providerRepository.findAll();
    }

    @Override
    public Optional<Provider> getProviderDetail(String id){
        return providerRepository.findById(id);
    }

    @Override
    public List<Provider> getProvidersByDepartment(String department){
        return providerRepository.getProvidersByDepartment(department);
    }

}

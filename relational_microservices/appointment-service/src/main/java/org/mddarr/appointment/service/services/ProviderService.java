package org.mddarr.appointment.service.services;


import org.mddarr.appointment.service.models.Provider;
import org.mddarr.appointment.service.repositories.ProviderRepository;
import org.mddarr.appointment.service.models.requests.PostProviderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


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

    @Override
    public String postProvider(PostProviderRequest postProviderRequest) {
        Provider provider = new Provider();
        String provider_id = UUID.randomUUID().toString();
        provider.setProviderid(provider_id);
        provider.setDepartment(postProviderRequest.getDepartment());
        provider.setLast_name(postProviderRequest.getLast_name());
        provider.setFirst_name(postProviderRequest.getFirst_name());
        provider.setTitle(postProviderRequest.getTitle());
        providerRepository.save(provider);
        return provider_id;
    }

    @Override
    public Optional<Provider> getProvider(String provider_id) {
        Optional<Provider> provider_result = providerRepository.findById(provider_id);
        return provider_result;
    }


}

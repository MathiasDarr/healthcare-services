package org.mddarr.provider_service.services;

import org.mddarr.provider_service.models.Provider;
import org.mddarr.provider_service.models.requests.PostProviderRequest;
import org.mddarr.provider_service.repositories.ProviderRepository;
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
        provider.setProvider_id(provider_id);
        provider.setDepartment(postProviderRequest.getDepartment());
        provider.setLast_name(postProviderRequest.getLast_name());
        provider.setFirst_name(postProviderRequest.getFirst_name());
        providerRepository.save(provider);
        return provider_id;
    }

    @Override
    public Optional<Provider> getProvider(String provider_id) {
        Optional<Provider> provider_result = providerRepository.findById(provider_id);
        return provider_result;
    }


}

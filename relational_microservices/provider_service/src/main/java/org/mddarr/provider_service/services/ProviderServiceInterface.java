package org.mddarr.provider_service.services;

import org.mddarr.provider_service.models.Provider;
import org.mddarr.provider_service.models.requests.PostProviderRequest;

import java.util.List;
import java.util.Optional;

public interface ProviderServiceInterface {

    List<Provider> getProviders();

    Optional<Provider> getProviderDetail(String id);
    List<Provider> getProvidersByDepartment(String department);

    String postProvider(PostProviderRequest postProviderRequest);
    Optional<Provider> getProvider(String provider_id);
}

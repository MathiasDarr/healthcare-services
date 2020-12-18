package org.mddarr.providerservice.services;

import org.mddarr.providerservice.models.Provider;

import java.util.List;

public interface ProviderServiceInterface {

    List<Provider> getProviders();
    List<Provider> getProvidersByDepartment(String department);

}

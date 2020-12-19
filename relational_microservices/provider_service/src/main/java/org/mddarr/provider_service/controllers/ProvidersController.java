package org.mddarr.provider_service.controllers;

import org.mddarr.provider_service.models.Provider;
import org.mddarr.provider_service.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProvidersController {

    @Autowired
    ProviderService providerService;

    @GetMapping(value="providers")
    public List<Provider> getPatients(){
        return providerService.getProviders();
    }

    @GetMapping(value="providers/{department}")
    public List<Provider> getPatientsByDepartment(@PathVariable String department){
        return providerService.getProvidersByDepartment(department);
    }




}

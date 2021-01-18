package org.mddarr.appointment.service.controllers;


import org.mddarr.appointment.service.models.Provider;
import org.mddarr.appointment.service.models.requests.PostProviderRequest;
import org.mddarr.appointment.service.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProvidersController {

    @Autowired
    ProviderService providerService;

    @GetMapping(value="providers")
    public List<Provider> getPatients(){
        return providerService.getProviders();
    }

    @GetMapping(value="providers/department/{department}")
    public List<Provider> getPatientsByDepartment(@PathVariable String department){
        return providerService.getProvidersByDepartment(department);
    }

    @GetMapping(value ="providers/{provider_id}")
    public Optional<Provider> getProviderDetail(@PathVariable String provider_id){
        return providerService.getProviderDetail(provider_id);
    }

    @PutMapping(value="providers")
    public String postProvider(@RequestBody PostProviderRequest postProviderRequest){
        return providerService.postProvider(postProviderRequest);
    }


}

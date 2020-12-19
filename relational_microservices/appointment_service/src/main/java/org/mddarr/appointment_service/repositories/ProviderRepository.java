package org.mddarr.appointment_service.repositories;


import org.mddarr.appointment_service.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, String> {

    @Query(value = "SELECT * FROM providers WHERE department = :department", nativeQuery = true)
    List<Provider> getProvidersByDepartment(String department);
}


package org.mddarr.providerservice;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

import java.util.List;

public interface ProviderRepository extends CrudRepository<Provider, String>{

    @Query("select * from providers where first_name= ?0")
    List<Provider> findByFirstName(String firstname);

}

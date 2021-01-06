package org.mddarr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Repository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public java.util.List<Provider> getEmployeeList() {
        List<Map<String, Object>> providers = jdbcTemplate.queryForList("select * from providers");
        return providers.stream().map(e -> {
            Provider provider = new Provider();
//            employee.setEmployeeName(e.get("employeeName").toString());
            provider.setProvider_id((Integer) e.get("provider_id"));
            provider.setFirst_name((String) e.get("first_name"));
            provider.setLast_name((String) e.get("last_name"));
            provider.setDepartment((String) e.get("department"));
            provider.setDepartment((String) e.get("department"));
            provider.setDepartment((String) e.get("department"));


            return provider;
        }).collect(Collectors.toList());
    }
}
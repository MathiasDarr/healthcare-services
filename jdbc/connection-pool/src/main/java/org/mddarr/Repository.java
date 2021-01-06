package org.mddarr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProviderDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public java.util.List<Employee> getEmployeeList() {
        List<Map<String, Object>> employees = jdbcTemplate.queryForList("select * from employee");
        return employees.stream().map(e -> {
            Employee employee = new Employee();
            employee.setEmployeeName(e.get("employeeName").toString());
            employee.setEmployeeId((Integer) e.get("employeeId"));
            employee.setEmployeeRole((String) e.get("employeeRole"));
            return employee;
        }).collect(Collectors.toList());
    }
}
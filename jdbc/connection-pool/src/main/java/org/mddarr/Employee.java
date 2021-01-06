package org.mddarr;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeRole;
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeRole() {
        return employeeRole;
    }
    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
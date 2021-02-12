package org.addresses.services;

import org.addresses.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void addEmployee(Employee employee);
    void deleteEmployee(int id);
}

package org.info.services;

import org.info.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void addEmployee(Employee employee);
    void deleteEmployee(int id);
}

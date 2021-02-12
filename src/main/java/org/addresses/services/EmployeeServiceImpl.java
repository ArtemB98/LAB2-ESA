package org.addresses.services;

import org.addresses.models.Employee;
import org.addresses.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public void addEmployee(Employee employee){
        repository.save(employee);
    }

    @Override
    public void deleteEmployee(int id){
        repository.deleteById(id);
    }
}

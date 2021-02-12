package org.addresses.services;

import org.addresses.models.Department;
import org.addresses.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    @Override
    public List<Department> findAll() {
        return (List<Department>) repository.findAll();
    }

    @Override
    public Department getDepartmentById(String id) {
        return repository.findById(id).orElse(null);
    }
}

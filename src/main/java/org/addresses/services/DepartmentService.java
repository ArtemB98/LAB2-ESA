package org.addresses.services;

import org.addresses.models.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    Department getDepartmentById(String id);
}

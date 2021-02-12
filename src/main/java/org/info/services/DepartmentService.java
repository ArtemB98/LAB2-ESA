package org.info.services;

import org.info.models.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    Department getDepartmentById(String id);
}

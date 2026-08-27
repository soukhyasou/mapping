package com.example.mapping.service;

import com.example.mapping.entity.Department;
import com.example.mapping.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department addDepartment(Department department) {
        return repository.save(department);
    }

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }
}
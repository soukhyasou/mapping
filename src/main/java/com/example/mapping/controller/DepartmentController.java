package com.example.mapping.controller;

import com.example.mapping.entity.Department;
import com.example.mapping.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return service.addDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }
}
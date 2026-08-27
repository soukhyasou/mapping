package com.example.mapping.controller;

import com.example.mapping.entity.Course;
import com.example.mapping.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }
}
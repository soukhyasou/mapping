package com.example.mapping.service;

import com.example.mapping.entity.Course;
import com.example.mapping.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public Course addCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }
}
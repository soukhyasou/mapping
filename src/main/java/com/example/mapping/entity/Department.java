package com.example.mapping.entity;

import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.OneToMany;
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "department")
    private List<Student> students;

    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
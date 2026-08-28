package com.example.mapping.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    // Bidirectional: Department ↔ Student
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Unidirectional: Student → student_IDCard
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_card_id")
    private student_IDCard idCard;

    // Unidirectional: Student → Hobby
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_hobby",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "hobby_id")
    )
    private List<Hobby> hobbies;

    public Student() {
    }

    public Student(String name) {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public student_IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(student_IDCard idCard) {
        this.idCard = idCard;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
}
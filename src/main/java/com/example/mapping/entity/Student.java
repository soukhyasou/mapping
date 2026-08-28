package com.example.mapping.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
//Bidirectional mapping
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
 //Unidirectional mapping,Student--Student_IDcard
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_card_id")
    private student_IDCard idCard;

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

    public  student_IDCard  getIdCard() {
        return idCard;
    }

    public void setIdCard( student_IDCard  idCard) {
        this.idCard = idCard;
    }
}

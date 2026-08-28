package com.example.mapping.repository;

import com.example.mapping.entity.student_IDCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDCardRepository extends JpaRepository<student_IDCard, Integer> {
}
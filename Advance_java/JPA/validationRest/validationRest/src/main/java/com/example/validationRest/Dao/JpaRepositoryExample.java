package com.example.validationRest.Dao;

import com.example.validationRest.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface JpaRepositoryExample extends JpaRepository<Student,Integer> {
}

package com.example.RestRepositoryLevel3.dao;

import com.example.RestRepositoryLevel3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentdao extends JpaRepository<Student ,Integer> {
}

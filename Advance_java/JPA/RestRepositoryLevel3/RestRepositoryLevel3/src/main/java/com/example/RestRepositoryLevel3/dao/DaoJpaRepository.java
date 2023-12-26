package com.example.RestRepositoryLevel3.dao;

import com.example.RestRepositoryLevel3.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoJpaRepository extends JpaRepository<Student, Integer> {
}

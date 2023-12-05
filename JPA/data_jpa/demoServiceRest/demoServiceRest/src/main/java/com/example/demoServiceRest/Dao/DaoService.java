package com.example.demoServiceRest.Dao;

import com.example.demoServiceRest.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoService extends JpaRepository<Student, Integer> {
}

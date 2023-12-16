package com.example.demoServiceRest.Dao;

import com.example.demoServiceRest.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoRepository extends JpaRepository<Student,Integer> {
}

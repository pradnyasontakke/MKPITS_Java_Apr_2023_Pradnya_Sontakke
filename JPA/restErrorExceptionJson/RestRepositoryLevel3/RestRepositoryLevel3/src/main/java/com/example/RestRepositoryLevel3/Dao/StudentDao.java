package com.example.RestRepositoryLevel3.Dao;

import com.example.RestRepositoryLevel3.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer>
        {
        }

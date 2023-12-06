package com.example.JPAServiceRestRepository.repository;
import com.example.JPAServiceRestRepository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<Student,Integer>
        {

        }


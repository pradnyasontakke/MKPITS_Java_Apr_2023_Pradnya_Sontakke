package com.example.JPAServiceRestRepository.Repository;
import com.example.JPAServiceRestRepository.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestRepository extends JpaRepository<Student,Integer>
        {

        }


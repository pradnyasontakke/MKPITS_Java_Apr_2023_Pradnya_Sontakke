package com.example.RestRepositoryLevel3.Dao;

import com.example.RestRepositoryLevel3.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestRepository extends JpaRepository<Student,Integer> {

}

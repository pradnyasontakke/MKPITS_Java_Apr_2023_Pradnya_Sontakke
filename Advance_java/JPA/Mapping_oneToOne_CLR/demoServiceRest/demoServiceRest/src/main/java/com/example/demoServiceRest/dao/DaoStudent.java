package com.example.demoServiceRest.dao;

import com.example.demoServiceRest.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoStudent extends JpaRepository <Student,Integer>{
}

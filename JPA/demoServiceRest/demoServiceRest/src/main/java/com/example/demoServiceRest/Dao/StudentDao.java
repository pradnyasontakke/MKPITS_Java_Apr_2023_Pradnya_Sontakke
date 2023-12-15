package com.example.demoServiceRest.Dao;

import com.example.demoServiceRest.Entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> findAll();
}

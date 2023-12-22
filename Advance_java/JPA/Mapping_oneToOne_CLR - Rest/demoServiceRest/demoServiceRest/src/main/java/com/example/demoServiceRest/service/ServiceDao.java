package com.example.demoServiceRest.service;

import com.example.demoServiceRest.Entity.Student;

public interface ServiceDao {
    String save(Student student);
    Integer findRollno(Integer rollno);
    Integer delete(Integer rollno);

}

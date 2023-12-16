package com.example.RestRepositoryLevel3.service;

import com.example.RestRepositoryLevel3.Entity.Student;

import java.util.List;

public interface ServiceDao {
    Student findRecord(Integer rollno);
   List<Student> findAll( );
   Student save(Student student);
   String deleteData(Integer rollno);
   Student updateData(Integer rollno);

}

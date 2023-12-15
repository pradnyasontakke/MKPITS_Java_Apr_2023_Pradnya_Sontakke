package com.example.demo7.Dao;

import com.example.demo7.Entity.Student;

import java.util.List;

public interface StudentDao {
        void save(Student student) ;  //write this method for the save data in our database
         Student  findData(Integer rollno);
        List<Student> findAll();
         Student updateData(Student student);
         void delete(Integer rollno);


}

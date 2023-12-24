package com.example.demoServiceRest.service;

import com.example.demoServiceRest.Entity.Student;
import java.util.List;
public interface ServiceDao {
    Student saveRecord(Student student);
    List<Student> findData();
    void  delete (Integer rollno);


}

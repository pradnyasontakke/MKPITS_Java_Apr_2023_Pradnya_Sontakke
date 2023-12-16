package com.example.validationRest.services;

import com.example.validationRest.Entity.Student;

import java.util.List;

public interface serviceStudent {
     Student saveData(Student student);
     List<Student>showData();

}

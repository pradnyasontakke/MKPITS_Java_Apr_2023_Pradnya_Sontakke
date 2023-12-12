package com.example.validationRest.services;

import com.example.validationRest.Entity.Student;

import java.util.List;

public interface serviceStudent {
     List<Student> show();
     Student saveData(Student student);

}

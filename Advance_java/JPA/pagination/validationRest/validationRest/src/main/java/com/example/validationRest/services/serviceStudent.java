package com.example.validationRest.services;

import com.example.validationRest.Entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface serviceStudent {
     Student saveData(Student student);
     List<Student>showData();
      Student update(Integer rollno);
      void deleteData(Integer rollno);
    Page<Student> getRecord(Pageable pageable);

}

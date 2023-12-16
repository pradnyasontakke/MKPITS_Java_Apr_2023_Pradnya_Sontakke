package com.example.demoServiceRest.Services;

import com.example.demoServiceRest.Entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface ServiceDao {
    Student saveData(Student student);
    List<Student> showAllData();
    Page<Student> getRecord(Pageable pageable);

//
//    Student UpdateRecord(Student student);
//    Student getRollNo(Integer roll_no);
//    void deleteStudent(Integer roll_no);

}

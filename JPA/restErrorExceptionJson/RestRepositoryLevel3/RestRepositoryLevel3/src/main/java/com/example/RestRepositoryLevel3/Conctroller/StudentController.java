package com.example.RestRepositoryLevel3.Conctroller;

import com.example.RestRepositoryLevel3.Entity.Student;
import com.example.RestRepositoryLevel3.service.ServiceStudentClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class StudentController {
    private ServiceStudentClass serviceStudentClass;

    public StudentController(ServiceStudentClass serviceStudentClass) {
        this.serviceStudentClass = serviceStudentClass;
    }

    @GetMapping("/student")
    public Student findDataStudent(@PathVariable Integer rollno){
        return serviceStudentClass.findData(rollno);
    }
}

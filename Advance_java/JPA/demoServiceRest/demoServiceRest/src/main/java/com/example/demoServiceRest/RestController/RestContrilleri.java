package com.example.demoServiceRest.RestController;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Servicess.StudentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestContrilleri {
    private StudentServiceImpl studentServiceImpl;
    public RestContrilleri(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
    @GetMapping("/r")
    public List<Student> Show(){
        return studentServiceImpl.findAllData();
    }
}

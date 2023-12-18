package com.example.demoServiceRest.RestController;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Servicess.StudentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContrilleri {
    private StudentServiceImpl studentServiceImpl;

    public RestContrilleri(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
    @GetMapping("/studentShow")
    public String dataDShow(Student student){
        studentServiceImpl.SaveData(student);
         return "save data";
    }
}

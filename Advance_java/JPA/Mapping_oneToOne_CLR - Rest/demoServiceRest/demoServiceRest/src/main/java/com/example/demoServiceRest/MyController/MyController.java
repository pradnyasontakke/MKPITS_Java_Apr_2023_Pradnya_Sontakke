package com.example.demoServiceRest.MyController;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Servicess.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  private StudentServiceImpl studentServiceImpl;

    public MyController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @PostMapping("/ShowMap")
    public String dataSave(@RequestBody Student student) {
        studentServiceImpl.SaveData(student);
        return "save data";
    }
}


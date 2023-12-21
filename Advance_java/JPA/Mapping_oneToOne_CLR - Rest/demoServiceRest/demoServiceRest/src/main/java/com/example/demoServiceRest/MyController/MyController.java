package com.example.demoServiceRest.MyController;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Servicess.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
  private StudentServiceImpl studentServiceImpl;

    public MyController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @GetMapping("/save")
    public String dataSave(@RequestBody Student student) {
        studentServiceImpl.Save(student);
        return "save data";
    }

}









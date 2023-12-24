package com.example.demoServiceRest.mycontroller;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Servicess.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private StudentServiceImpl studentService;
@Autowired
    public MyController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/save")
    public String savedata(@RequestBody Student student){
    studentService.SaveData(student);
    return "data saved";
    }
}

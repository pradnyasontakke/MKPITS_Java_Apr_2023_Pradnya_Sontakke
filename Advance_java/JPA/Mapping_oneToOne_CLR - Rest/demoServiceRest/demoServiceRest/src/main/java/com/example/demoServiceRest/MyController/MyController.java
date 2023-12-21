package com.example.demoServiceRest.myController;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.service.ServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private ServiceImpl serviceImpl;
    public MyController(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }
    @GetMapping("/save")
    public String savedata(Student student){
        serviceImpl.save(student);
        return "data save";
    }
}

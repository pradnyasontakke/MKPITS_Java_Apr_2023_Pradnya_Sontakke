package com.example.RestRepositoryLevel3.my_controller;

import com.example.RestRepositoryLevel3.Entity.Address;
import com.example.RestRepositoryLevel3.Entity.Student;
import com.example.RestRepositoryLevel3.servicess.ServiceDao;
import com.example.RestRepositoryLevel3.servicess.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
 private ServiceDao serviceDao;
@Autowired
    public MyController(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @PostMapping("/createStudents")
    public String create(@RequestBody Student student){
      Address address=new Address(2,"ramnagar","cpur");
      Student student1=new Student("nita",address);
      serviceDao.savedata(student1);
        return "create data successfully";
    }

}



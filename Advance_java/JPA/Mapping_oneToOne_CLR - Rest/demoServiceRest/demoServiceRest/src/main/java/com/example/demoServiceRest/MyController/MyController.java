package com.example.demoServiceRest.myController;
import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
   private ServiceDao serviceDao;
@Autowired
    public MyController(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

//    @PostMapping("/students")
//    public String savedata(Student student){
////        Address address=new Address("pune","MH");
////        Student student1=new Student(101,"teju",address);
//        serviceDao.saveRecord(student);
//        return "data inserted successfully";
//    }

    // show all data
    @GetMapping("/showStudents")
    public List<Student> show(){
        return serviceDao.findData();
    }
//

    @PostMapping("/showData")
    public String save(@RequestBody Student student){
      serviceDao.saveRecord(student);
      return "data save";
    }
    @GetMapping("/updateStudents")
    public String updateStudent(@RequestParam("rollno")int rollno, Model model){
    Student student=serviceDao.update(rollno);
    model.addAttribute("stud",student);
    return "updated rollno";
    }


    @GetMapping("/delete/{rollno}")
    public String delete(@PathVariable Integer rollno){
     serviceDao.delete(rollno);
     return "deleted rollno";
    }
}


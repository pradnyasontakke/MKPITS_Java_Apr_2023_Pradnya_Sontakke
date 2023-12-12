package com.example.validationRest.MyRestController;

import com.example.validationRest.Entity.Student;

import com.example.validationRest.services.ServiceClass;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentRestController {
    private ServiceClass serviceClass;
    @Autowired
    public StudentRestController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }


    @GetMapping("/register")

    public String registrtion(Model model){

        Student student=new Student();
        model.addAttribute("stud",student);
        return "registration";
    }
    @PostMapping("/savedata")
    public String saveRecord(@ModelAttribute("stud") Student student){
        serviceClass.saveData(student);
        return "redirect:/show";
    }
    @GetMapping("/show")
    public String showData(Model model) {
        List<Student> list= serviceClass.show();
        model.addAttribute("stud",list);
        return "homePage";
    }



}

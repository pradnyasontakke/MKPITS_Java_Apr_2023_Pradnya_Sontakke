package com.example.validationRest.MyRestController;

import com.example.validationRest.Entity.Student;

import com.example.validationRest.services.ServiceClass;
import jakarta.validation.Valid;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/saveData")
    public String saveRecord(@Valid @ModelAttribute("stud") Student student, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "registration";
        }
        else
        {
            serviceClass.saveData(student);
            return "redirect:/homepage";
        }
    }


    @GetMapping("/homepage")
    public String show( @PageableDefault(size = 8) Pageable pageable, Model model){
    Page<Student>student=serviceClass.getRecord(pageable);
//        List <Student>student=serviceClass.showData();
        model.addAttribute("show",student);
        return "DisplayData";
    }

    @GetMapping("/update")
    public String updateStudent(@RequestParam("rollno")int roll_no, Model model){
        Student student=serviceClass.update(roll_no);
        model.addAttribute("stud",student);
        return "registration";


    }
    @GetMapping("/delete/{rollno}")
    public String delete(@PathVariable Integer rollno){
        serviceClass.deleteData(rollno);
        return "redirect:/homepage";
    }
}

package com.example.demoServiceRest.RestController;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Services.ServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController<pageable> {
    private ServiceImpl serviceImpl;
    @Autowired
    public MyController(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }
    @GetMapping("/register")
    public String registerUser(Model model){
        Student student=new Student();
        model.addAttribute( "stud", student);
        return"Registration";
    }

    public String saveRecord(@ModelAttribute("stud") Student student) {
        serviceImpl.saveData(student);
        return "redirect:/homepage";
    }
    public String show(pageable pageable,Model model) {
        Page studentPage= (Page) serviceImpl.getRecord((Pageable) pageable);
        //       Page <Student>studentPages = (Page) serviceImpl.getRecord(Pageable pageable )
        model.addAttribute("stud",studentPage);
        return "display";
    }

}








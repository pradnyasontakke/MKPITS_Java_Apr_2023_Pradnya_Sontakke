package com.example.demoServiceRest.RestController;

import com.example.demoServiceRest.Entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping ("/hello")
    public  String show(Model model){
        Student student=new Student();
        model.addAttribute("stud", student);
//        model.addAttribute("name","pradnya");
            return"hello";
    }

    @PostMapping("/display")
    public  String addData(@ModelAttribute("stud") Student theStudent){
        return "datashow";
    }
//   public String addData(HttpServletRequest request,Model model){
////       int rollno= Integer.parseInt(request.getParameter("rolln"));
//        String rollno = request.getParameter("rollno");
//        model.addAttribute("rno", rollno);
//
//        String name=request.getParameter("sName");
//        model.addAttribute("nm", name);
//
//        String city=request.getParameter("sCity");
//        model.addAttribute("ct", city);
//
////        return "datashow";
//    }
}

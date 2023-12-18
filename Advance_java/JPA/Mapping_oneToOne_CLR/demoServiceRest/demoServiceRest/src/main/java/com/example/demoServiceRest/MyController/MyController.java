//package com.example.demoServiceRest.MyController;
//
//import com.example.demoServiceRest.Servicess.StudentServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class MyController {
//    private StudentServiceImpl studentServiceImpl;
//@Autowired
//    public MyController(StudentServiceImpl studentServiceImpl) {
//        this.studentServiceImpl = studentServiceImpl;
//    }
//    public String show()
//}
//    @GetMapping("/homepage")
//    public String show( Model model){
//        List<Student> student=serviceClass.showData();
//        model.addAttribute("show",student);
//        return "DisplayData";
//    }
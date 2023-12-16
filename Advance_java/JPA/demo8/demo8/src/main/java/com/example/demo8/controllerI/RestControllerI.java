package com.example.demo8.controllerI;

import com.example.demo8.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/h")
public class RestControllerI {
    @GetMapping("/i")
    public String show(){


        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"pratik","bhadrawati"));
        studentList.add(new Student(2,"pranish","pune"));
        studentList.add(new Student(3,"prashant","nagpur"));
        return studentList.toString();
    }
    @GetMapping("/student/{studentId}")
    public Student getDetails(@PathVariable int studentId) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(5, "ahuti", "pune"));
        return studentList.get(studentId);

    }
}

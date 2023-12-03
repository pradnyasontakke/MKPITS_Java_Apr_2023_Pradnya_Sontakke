package com.example.demoServiceRest.RestCont;

import com.example.demoServiceRest.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentDao {
    public List<Student> findAll();
}

package com.example.validationRest.services;

import com.example.validationRest.Dao.JpaRepositoryExample;
import com.example.validationRest.Entity.Student;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class ServiceClass implements serviceStudent{

    private JpaRepositoryExample jpaRepositoryExample;
@Autowired
    public ServiceClass(JpaRepositoryExample jpaRepositoryExample) {
        this.jpaRepositoryExample = jpaRepositoryExample;
    }

    @Override
    public List<Student> show()

    {
        return jpaRepositoryExample.findAll();
    }

    @Override
    @Transactional
    public Student saveData(@ModelAttribute("stud") Student student) {
        return jpaRepositoryExample.save(student) ;
    }


}
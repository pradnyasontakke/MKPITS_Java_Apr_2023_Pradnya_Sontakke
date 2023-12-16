package com.example.demoServiceRest.Servicess;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentServiceDao{
    private StudentDaoImpl studentDaoImpl;
@Autowired
    public StudentServiceImpl(StudentDaoImpl studentServiceDao) {
        this.studentDaoImpl = studentServiceDao;
    }


    @Override
    public List<Student> findAllData() {
        return studentDaoImpl.findAll();
    }
}

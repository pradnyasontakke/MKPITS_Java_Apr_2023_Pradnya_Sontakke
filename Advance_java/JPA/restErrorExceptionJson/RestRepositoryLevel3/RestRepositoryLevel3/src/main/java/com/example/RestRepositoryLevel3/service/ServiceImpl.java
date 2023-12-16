package com.example.RestRepositoryLevel3.service;

import com.example.RestRepositoryLevel3.Dao.StudentDao;
import com.example.RestRepositoryLevel3.Entity.Student;
import com.example.RestRepositoryLevel3.ExceptionStudent.RecordNotFound;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements ServiceDao {
     private StudentDao studentDao;

    @Autowired
    public ServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    public Student findRecord(Integer rollno) {

        Optional<Student> student=studentDao.findById(rollno);
        if(student.isEmpty()) {
            throw new RecordNotFound("not found");
        }
      return   student.get();
    }

    @Override
    public List <Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    @Transactional
    public String deleteData(Integer rollno) {
        studentDao.deleteById(rollno);
        return "delete roll number data";
    }

    @Override
    public Student updateData(Integer rollno) {
       Student student= studentDao.findById(rollno).get();
        return student;
    }

    }






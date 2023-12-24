package com.example.demoServiceRest.service;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.dao.DaoJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ServiceDao {
   private DaoJpaRepository daoJpaRepository;
@Autowired
    public ServiceImpl(DaoJpaRepository daoJpaRepository) {
        this.daoJpaRepository = daoJpaRepository;
    }

    @Override
    @Transactional
    public Student saveRecord(Student student) {
       return daoJpaRepository.save(student);
    }

    @Override
    public List<Student> findData() {
    List<Student> studentList=daoJpaRepository.findAll();
        return studentList;
    }

    @Override
    public void delete(Integer rollno) {
    daoJpaRepository.deleteById(rollno);

    }


}





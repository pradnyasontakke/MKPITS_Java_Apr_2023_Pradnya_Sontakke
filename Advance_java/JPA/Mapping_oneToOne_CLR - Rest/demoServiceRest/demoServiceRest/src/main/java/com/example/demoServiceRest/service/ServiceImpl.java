package com.example.demoServiceRest.service;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.dao.DaoJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceDao {
   private DaoJpaRepository daoJpaRepository;
@Autowired
    public ServiceImpl(DaoJpaRepository daoJpaRepository) {
        this.daoJpaRepository = daoJpaRepository;
    }

    @Override
    @Transactional
    public String save(Student student) {
        daoJpaRepository.save(student);
        return "data saved";
    }

    @Override
    @Transactional
    public Integer findRollno(Integer rollno) {
    return daoJpaRepository.findById(rollno).get().getRollno();
    }

    @Override
    @Transactional
    public Integer delete(Integer rollno) {
        daoJpaRepository.deleteById(rollno);
        return rollno;
    }
}





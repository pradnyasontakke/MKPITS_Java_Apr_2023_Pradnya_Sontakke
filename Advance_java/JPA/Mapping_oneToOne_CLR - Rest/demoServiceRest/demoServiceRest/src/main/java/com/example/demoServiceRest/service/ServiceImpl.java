package com.example.demoServiceRest.service;

import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.service.ServiceDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceDao {
    private ServiceDao serviceDao;
    @Autowired
    public ServiceImpl(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @Override
    @Transactional
    public String save(Student student) {
        return serviceDao.save(student);
    }
}

package com.example.RestRepositoryLevel3.service;

import com.example.RestRepositoryLevel3.Dao.RestRepository;
import com.example.RestRepositoryLevel3.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceStudentClass implements serviceStudent{
    private RestRepository restRepository ;
    @Autowired
    public ServiceStudentClass(RestRepository restRepository) {
        this.restRepository = restRepository;
    }

    @Override
    public Student findData(Integer rollno) {
       Optional<Student> optional=restRepository.findById(rollno);
        return optional.get();
    }
}

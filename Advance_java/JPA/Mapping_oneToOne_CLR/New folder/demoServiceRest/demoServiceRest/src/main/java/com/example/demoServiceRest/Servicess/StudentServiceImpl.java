package com.example.demoServiceRest.Servicess;

import com.example.demoServiceRest.Dao.DaoService;
import com.example.demoServiceRest.Entity.Student;
//import com.example.demoServiceRest.RestCont.StudentDaoImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentServiceDao{
  private DaoService daoService;
    @Autowired
    public StudentServiceImpl(DaoService daoService) {
        this.daoService = daoService;
    }


    @Override
    @Transactional
    public String  SaveData(Student student) {
         daoService.save(student);
      return "record saved";

    }
}

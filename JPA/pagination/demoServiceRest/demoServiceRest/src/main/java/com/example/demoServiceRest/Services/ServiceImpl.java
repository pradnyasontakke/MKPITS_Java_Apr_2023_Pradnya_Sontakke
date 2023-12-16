package com.example.demoServiceRest.Services;

import com.example.demoServiceRest.Dao.DaoRepository;
import com.example.demoServiceRest.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class ServiceImpl implements ServiceDao{
    private DaoRepository daoRepository;
@Autowired
    public ServiceImpl(DaoRepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @Override
    @Transactional
    public Student saveData(@ModelAttribute("stud") Student student) {
        return daoRepository.save(student);
    }

    @Override
    public List<Student> showAllData() {
        return daoRepository.findAll();
    }

    @Override
    public Page<Student> getRecord(Pageable pageable) {
        return daoRepository.findAll(pageable);
    }
}

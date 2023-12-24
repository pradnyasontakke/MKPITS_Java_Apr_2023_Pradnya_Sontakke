package com.example.demoServiceRest.Servicess;

//import com.example.demoServiceRest.RestCont.StudentDaoImpl;
import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.dao.DaoStudent;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceDao {
  private DaoStudent daoStudent;
@Autowired
  public StudentServiceImpl(DaoStudent daoStudent) {
    this.daoStudent = daoStudent;
  }

  @Override
  @Transactional
  public String SaveData(Student student) {
    daoStudent.save(student);
    return "record save";

}



}






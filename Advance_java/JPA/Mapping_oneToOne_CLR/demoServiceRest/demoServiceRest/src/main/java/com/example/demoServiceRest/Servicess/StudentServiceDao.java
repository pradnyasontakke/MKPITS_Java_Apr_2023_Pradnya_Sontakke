package com.example.demoServiceRest.Servicess;

import com.example.demoServiceRest.Entity.Student;

public interface StudentServiceDao {
   String SaveData(Student student);

   Student find(Integer rollno);
Integer delete(Integer rollno);

}

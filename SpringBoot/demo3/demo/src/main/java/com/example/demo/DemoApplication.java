package com.example.demo;

import com.example.demo.dao.StudentDaoImpl;
import com.example.demo.dao.studentDao;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hii");

	}
	@Bean
			public CommandLineRunner commandLineRunner(studentDao studentDao)
	{
		return runner->{
	System.out.println("hello");
//			createStudent(studentDao);
		};
	}
   public void createStudent(studentDao studentDao){
	   Student student=new Student("riya","pune");
	   studentDao.save(student);
   }


}

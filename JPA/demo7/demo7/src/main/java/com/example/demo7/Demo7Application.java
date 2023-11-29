package com.example.demo7;

import com.example.demo7.Dao.StudentDao;
import com.example.demo7.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo7Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo7Application.class, args);
		System.out.println("hii");
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner ->
		{
//			System.out.println("hello");
			createStudent(studentDao);
            		};
	}
     public void createStudent(StudentDao studentDao){
		 Student student=new Student("pranish","nagpur");
		 studentDao.save(student);
//		 System.out.println(student);

	 }
}

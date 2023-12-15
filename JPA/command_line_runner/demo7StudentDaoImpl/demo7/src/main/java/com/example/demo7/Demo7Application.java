package com.example.demo7;

import com.example.demo7.Dao.StudentDao;
import com.example.demo7.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Demo7Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo7Application.class, args);
//		System.out.println("hii");
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner ->
		{
//			System.out.println("hello");
			createStudent(studentDao);
//			findDemo(studentDao);
//			deleteData(studentDao);
//			update(studentDao);
//			findAllRecord(studentDao);
            		};
	}
     public void createStudent(StudentDao studentDao){
		 Student student=new Student("pradnya","bhadrawati");
		 studentDao.save(student);
		 System.out.println(student);
	 }
	 public void findDemo(StudentDao studentDao){    //find the wanted data from database
		Student student=studentDao.findData(1);
		 System.out.println(student);
	 }
	public void findAllRecord(StudentDao studentDao)
	{
		List<Student> studentList=studentDao.findAll();
		for (Student student:studentList
		) {
			System.out.println(student);
		}
	}


	 public void update(StudentDao studentDao) {
		 Student student=studentDao.findData(2);
		 student.setName("ruchi");
		 student.setCity("chandrapur");
		 studentDao.updateData(student);
		 System.out.println("update data");
	 }

	 public void deleteData(StudentDao studentDao){
		studentDao.delete(3);

	 }
}

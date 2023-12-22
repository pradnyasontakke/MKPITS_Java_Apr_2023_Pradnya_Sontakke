package com.example.demoServiceRest;

import com.example.demoServiceRest.Entity.Address;
import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.Servicess.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class DemoServiceRestApplication implements CommandLineRunner {
	private StudentServiceImpl studentServiceImpl;
	@Autowired
	public DemoServiceRestApplication(StudentServiceImpl studentServiceImpl) {
		this.studentServiceImpl = studentServiceImpl;
	}



	public static void main(String[] args) {
		SpringApplication.run(DemoServiceRestApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
//		save();
		find();
//		delete(1);

	}
	public void save(){
		Address address=new Address("bardi","nagpur");
		Student student=new Student("ritan",address);
		String save_Student_data=studentServiceImpl.SaveData(student);
		System.out.println(save_Student_data);
//		System.out.println(student);
//		System.out.println(address);
		}

	public void find() {
		Student findData = studentServiceImpl.find(602);
		System.out.println(findData);
	}


//
//		public Integer delete(@PathVariable Integer rollno) {
//			System.out.println("data deleted");
//            return studentServiceImpl.delete(rollno);
//
//		}



		}
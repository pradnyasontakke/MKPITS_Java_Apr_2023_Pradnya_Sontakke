package com.example.demoServiceRest;

import com.example.demoServiceRest.Entity.Address;
import com.example.demoServiceRest.Entity.Student;
import com.example.demoServiceRest.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class DemoServiceRestApplication implements CommandLineRunner {
private ServiceImpl serviceImpl;
@Autowired
	public DemoServiceRestApplication(ServiceImpl serviceImpl) {
		this.serviceImpl = serviceImpl;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceRestApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
      save();
		deleteData(161);
		find();
	}
	public void save(){
		Address address=new Address("mahal","nagpur");
	Student student=new Student(165,"komal",address);
	String student1=serviceImpl.save(student);
		System.out.println("student1");
	}
	public void deleteData(@PathVariable Integer rollno ){
        serviceImpl.delete(rollno);
		System.out.println("data deleted");
    }

	public void find() {
		Integer findData =serviceImpl.findRollno(162);
		System.out.println(findData);
	}
}










//In validation rule it has three steps
//1= in entity class we mention error message in which variable we want to validate
//2= In control class we can write the error message in if else condition
//in registration page we write hasError method in name field  in span


package com.example.validationRest.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Student {
@Id
    private int rollno;
    @NotNull(message = "This field is required")
    @Size(min = 3, max = 10,message = " This field  is required")
    private String name="";
    private String city;

    public Student() {
    }

    public Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

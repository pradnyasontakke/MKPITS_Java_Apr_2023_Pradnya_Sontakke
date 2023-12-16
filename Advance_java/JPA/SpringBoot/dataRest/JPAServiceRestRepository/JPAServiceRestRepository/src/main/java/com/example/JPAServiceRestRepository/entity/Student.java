package com.example.JPAServiceRestRepository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollno;
    private String name;
    private  String city;

    public Student() {

    }


   public Student(int rollno,String name,String city ){
       this.rollno=rollno;
       this.name=name;
       this.city=city;
   }

    public int getRollno() {
        return rollno;
    }
    public String getName(){
       return name;
    }
    public String getcity(){
       return  city;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setName(String name){
       this.name=name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

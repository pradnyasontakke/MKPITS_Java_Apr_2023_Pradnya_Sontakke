package com.example.demo7.Entity;

import jakarta.persistence.*;

@Entity
@Table                       //   this is our table class and database table, if our database table name and class name is
                          // different that time we can write @Table ("database table name")

public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)   //when we delete data from data base so for initialization we can write this code
                                   //rollno is  primary key and we are write auto-increment so its automatically increment for this we write @Id
    private int rollno;
    private String name;
    private String city;
    public Student(){
    }

    public Student(String name, String city) {  //we can not create rollno constr because roll no is autoincrement and for this we write @Id
        this.name = name;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {    //we can add toString method when database stored address
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

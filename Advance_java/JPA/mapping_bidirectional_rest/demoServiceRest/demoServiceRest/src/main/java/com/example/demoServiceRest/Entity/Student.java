package com.example.demoServiceRest.Entity;

import com.example.demoServiceRest.Entity.Address;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;


//    private Address address;
//    @OneToMany(cascade =CascadeType.ALL)
//    @JoinColumn(name = "course_info_id")
//    private List<Course> course;
//
//    public Student(List<Course> course) {
//        this.course = course;
//    }
//
//    public List<Course> getCourse() {
//        return course;
//    }
//
//    public void setCourse(List<Course> course) {
//        this.course = course;
//    }
//
//    public Student(Address address1) {
//
@Entity
@Table(name="Student_Info")
public class Student {
    @Id
    private int rollno;
    private String name;
        @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name ="Student_Address_id")
    private Address address;

    public Student() {
    }

    public Student(int rollno, String name, Address address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public Student(String name , Address address) {
        this.name = name;
        this.address=address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


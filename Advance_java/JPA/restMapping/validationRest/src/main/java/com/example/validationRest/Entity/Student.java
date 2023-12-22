package com.example.validationRest.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="StudentInfo")
public class Student {
    @Id
    private int rollno;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="StudentAddress_id")
    private Address address;
    public Student() {
    }

    public Student( String name ,Address address) {
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

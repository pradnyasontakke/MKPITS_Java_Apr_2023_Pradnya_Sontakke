package com.example.Rest_Mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student_info")
public class Student {
    @Id
    private int roll_no;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="Student_Address_id")
    private Address address;

    public Student() {
    }

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
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
}

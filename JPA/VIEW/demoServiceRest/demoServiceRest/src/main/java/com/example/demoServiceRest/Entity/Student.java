package com.example.demoServiceRest.Entity;

public class Student {
    private int rollno;
    private String name;
    private String city;
    private String gender;

    public Student() {
    }

    public Student(int rollno, String name, String city, String gender) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

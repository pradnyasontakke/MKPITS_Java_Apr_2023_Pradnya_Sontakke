package com.example.Rest_Mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Student_Address")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String Area;
    private String City;

    public Address() {

    }

    public Address(String area, String city, int id) {
        this.Area = area;
        this.City = city;
        this.id = id;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}





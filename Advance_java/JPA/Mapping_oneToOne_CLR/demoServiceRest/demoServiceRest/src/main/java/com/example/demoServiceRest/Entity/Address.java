package com.example.demoServiceRest.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Student_address")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String Area;
    private String city;

    public Address() {
    }

    public Address( String area, String city) {
      this.Area = area;
        this.city = city;
    }


    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", Area='" + Area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


package com.example.RestRepositoryLevel3.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_Addess")
public class Address {
    @Id
    private int id;
    private String area;
    private String city;

    public Address() {
    }

    public Address(int id, String area, String city) {
        this.id = id;
        this.area = area;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

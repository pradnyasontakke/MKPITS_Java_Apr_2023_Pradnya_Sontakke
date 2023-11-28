package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Immutable;

@Entity
@Table
public class Student {
    @Id
    private int rollno;
    private String name;
    private String city;

    public Student() {
    }

    public Student( String name, String city) {
        this.name = name;
        this.city = city;
    }
}

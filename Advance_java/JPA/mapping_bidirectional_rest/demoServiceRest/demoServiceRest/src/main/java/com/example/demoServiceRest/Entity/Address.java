package com.example.demoServiceRest.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="Student_Address")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String Area;
    private String city;
    @JsonBackReference
    @OneToOne(mappedBy = "address",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})

    public Student student;
    public Address(Student student) {
        this.student = student;
    }

    public Address( String area, String city) {
      this.Area = area;
        this.city = city;
    }

    public Address() {

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


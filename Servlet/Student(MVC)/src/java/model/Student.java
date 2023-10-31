/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;

/**
 *
 * @author LENOVO
 */
public class Student {
        
        private String name;  
          private String city;  
    

 Student(){
}

    public Student( String name,String city) {
       
        this.name = name;
         this.city = city;
    }

    public Student(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public String city() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }
  
}
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class ExampleJavaClass {  //employee class
        private String name;
    private String id;

    public ExampleJavaClass() {
    }

    public ExampleJavaClass(String name, String id) {
        this.name = name;
        this.id = id;
    }

 void show(){  
    System.out.println(name +" "+id);  
    
}}
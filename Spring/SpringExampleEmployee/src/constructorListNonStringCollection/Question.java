/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorListNonStringCollection;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Question {
    private int srno;
    private String name;
    private List<Answer>asnwer;
    public  Question (){}

    public Question(int srno, String name, List<Answer> asnwer) {
        this.srno = srno;
        this.name = name;
        this.asnwer = asnwer;
    }
    public void display(){
        System.out.println(srno+""+name);
     
 }
    
    
}

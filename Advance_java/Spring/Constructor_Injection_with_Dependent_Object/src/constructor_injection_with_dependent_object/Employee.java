/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_injection_with_dependent_object;

/**
 *
 * @author LENOVO
 */
public class Employee {
    private int id;
    private String name;
    private Address address;   //aggregation,  address(dependent object)

    public Employee() {
    }

    public Employee(int id, String name, Address address) {
        
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void show(){
        System.out.println(id+""+name);
        System.out.println(address.toString());
    }
    
}

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
public class Address {
    private String city;
    private String State;
    private String country;

    public Address() {
    }

    public Address(String city, String State, String country) {
        super();
        this.city = city;
        this.State = State;
        this.country = country;
    }
    public String  tostring(){
    return city+""+State+""+country;
            }
    
}

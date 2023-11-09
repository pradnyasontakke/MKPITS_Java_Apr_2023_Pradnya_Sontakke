
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */

//service page means controller


public class ServiceJavaClass {
    Connection connection;
    
    public ServiceJavaClass(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
      
        }catch(Exception e){
            out.println(e);} 
    }
    public int LoginService(JavaClass  javaclass){
        
      
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Registration where userId=?and password=?");
           
           preparedStatement.executeQuery();
        }catch(Exception e){ out.println(e);
        
        }
        return 0;
        
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    
    
}

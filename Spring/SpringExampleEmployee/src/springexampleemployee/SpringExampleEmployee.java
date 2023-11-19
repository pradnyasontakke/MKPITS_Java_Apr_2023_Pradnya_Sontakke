/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springexampleemployee;

import Collection.Question;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/**
 *
 * @author LENOVO
 */
public class SpringExampleEmployee {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//constructor simple class       
        Resource resource =new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Employee e=(Employee)factory.getBean("Empbean");  
       e.show();
        
        

//ConstructorInjectionWithDependantObject
      
    Question que=(Question)factory.getBean("queid");  
    que.display();  
    
    
    
    
      
    }
    }
    


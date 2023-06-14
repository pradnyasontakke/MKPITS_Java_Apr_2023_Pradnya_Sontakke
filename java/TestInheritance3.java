class Bank{  
List<transaction> transaction;
String Employee name;
Transation type transationtype;

void eat(){System.out.println("eating...");}  
}  
class loan extends Bank{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  
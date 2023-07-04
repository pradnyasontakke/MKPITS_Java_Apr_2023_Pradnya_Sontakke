abstract class  InterfaceBank{

   public String name(String Employeename ){
   
  System.out.println("Default Method Executed");
  return "Employeename";
  }
    
}
class Homeloan3 extends InterfaceBank
{
       public String name(String Employeename )
	   {
	    System.out.println("Default Method ");
		

    return "Employeename";
}}
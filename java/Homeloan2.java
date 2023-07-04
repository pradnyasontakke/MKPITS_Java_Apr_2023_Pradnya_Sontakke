interface  InterfaceBank{

   public String name(String Employeename );
    
}
class Homeloan2 implements InterfaceBank,bank2
{
       public String name(String Employeename )
	   {
	    System.out.println("Default Method Executed");
		

    return "Employeename";
}}
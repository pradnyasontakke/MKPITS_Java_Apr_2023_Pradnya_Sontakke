interface  InterfaceBank{

   public String name(String Employeename );
    
}
class Homeloan implements InterfaceBank
{
       public String name(String Employeename )
	   {
	    System.out.println("Default Method Executed");
		}


}
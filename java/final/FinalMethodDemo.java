//extends class
class FinalMethodDemo extends FinalMethod
{
	//override show method
public void show()
{
System.out.println("This is the final method 1");
}
//create main class
public static void main (String args [])
{
	//create object
FinalMethodDemo fm=new FinalMethodDemo();
fm.show();
} 
}
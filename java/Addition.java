 /**
	*@param  l0ine declare scope, return type method name variable declare
	*return value
	*18 line object create and call the object
	*  20print ans.
	*
	**/
 
 public class Addition
{
	
	public int addInteger( int number1, int number2)
	
	{
		return number1+number2;
	}
	public static void main( String args[])
	{
		
	Addition addition= new Addition();
		int answer =addition.addInteger(10,30);
			System.out.println(answer);

	}
}









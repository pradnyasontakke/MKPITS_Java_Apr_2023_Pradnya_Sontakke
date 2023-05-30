 
 class Byte1
{
	 public Byte addByte( Byte number1, Byte number2)
	
	{
		return number1+number2;
	}

	 public static void main( String args[])
	{
		
	Addition addition= new Addition();
		Byte answer =addition.addByte(101,100);
			System.out.println(answer);

	}
}

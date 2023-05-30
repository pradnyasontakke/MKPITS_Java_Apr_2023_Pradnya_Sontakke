
class Double
{
     public double AddDouble(double number1,double number2)
	{	
				 return (number1+number2);
	}
}
	
    class Double1
	{
    public static void main(String[] args)
		  {
		    Double double_obj=new Double();
			double add=double_obj.AddDouble(10,20);
			System.out.println(add);
		  }
}
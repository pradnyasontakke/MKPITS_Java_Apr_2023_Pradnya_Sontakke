
class Double{
     double AddDouble(double number1,double number2)
	{	
				 return (number1+number2);
	}
}
	
    class Double1{
    static void main(String[] args)
		  {
		    Double double_obj=new Double();
			Double add=double_obj.AddDouble(10d,20d);
			System.out.println(add);
		  }
}
class DoubleDemo
{
	public double demoDouble( double number1, double number2)
	{
	return number1+number2;
}
public static void main(String args[])
{
	DoubleDemo double1 = new DoubleDemo();
	double add =double1.demoDouble(1.1d,1.2d);
	System.out.println(add);
}
}
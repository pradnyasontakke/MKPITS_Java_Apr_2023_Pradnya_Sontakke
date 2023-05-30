class AdditionFloat
{

 public float addFloat( float number1, float number2)
{
return (number1+number2);
}
 public static void main(String args[])
{
AdditionFloat addfloat=new AdditionFloat();
int answer =addfloat.addFloat( 1.5,1.5);
System.out.println(answer);
}
}
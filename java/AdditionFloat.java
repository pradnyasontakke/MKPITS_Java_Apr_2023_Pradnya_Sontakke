class AdditionFloat{

 public float addFloat( float number1, float number2)
{
return number1+number2;
}
 public static void main(String args[])
{
AdditionFloat addfloat=new AdditionFloat();
float answer =addfloat.addFloat(1.5f,1.58f);
System.out.println(answer);
}
}
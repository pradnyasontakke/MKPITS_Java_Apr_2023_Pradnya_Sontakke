 public class SubstractionDouble
{
public double subDouble( double number1, double number2)
{
return number1-number2;
}
public static void main(String args[])
{
SubstractionDouble sub =new SubstractionDouble();
  double ans = sub.subDouble( 111111,43333);
System.out.println(ans);
}
}
 public class Substraction
{
public int subint( int number1, int number2)
{
return number1-number2;
}
public static void main(String args[])
{
Substraction sub =new Substraction();
int ans = sub.subint( 10,4);
System.out.println(ans);
}
}
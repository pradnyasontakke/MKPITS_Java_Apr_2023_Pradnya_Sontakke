 public class SubstractionFloat
{
public float subFloat( float number1, float number2)
{
return number1-number2;
}
public static void main(String args[])
{
SubstractionFloat sub =new SubstractionFloat();
  float ans = sub.subFloat( 1.1f,4.1f);
System.out.println(ans);
}
}
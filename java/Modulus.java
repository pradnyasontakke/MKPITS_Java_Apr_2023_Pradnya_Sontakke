public class Modulus
{
public int modInt(int number1,int number2)
{
return number1 / number2;
}
public static void main(String args[])
{
Modulus mod = new Modulus();
int ans = mod.modInt(10,5);
System.out.println(ans);
}
}
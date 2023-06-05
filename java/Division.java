public class Division
{
public int divInt(int number1,int number2)
{
return number1 / number2;
}
public static void main(String args[])
{
Division div = new Division();
int ans = div.divInt(10,5);
System.out.println(ans);
}
}
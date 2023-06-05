 public class SubstractionShort
{
public short subShort( short number1, short number2)
{
return number1-number2;
}
public static void main(String args[])
{
SubstractionShort sub =new SubstractionShort();
  int ans = sub.subShort( 1,4);
System.out.println(ans);
}
}
import java.util.Scanner;
public class DecimalToBinary1
{
public int nextInt( int number1)
	
	{
		return number1;
	}
	

public static void main(String args[])
{


Scanner sc = new Scanner(System.in);

int num = sc.nextInt();
System.out.println("enter the number");
String decimalVal=Integer.toBinaryString(num);

System.out.println("Binary value" +decimalVal);


}
}
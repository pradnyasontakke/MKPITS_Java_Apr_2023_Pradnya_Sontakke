import java.util.Scanner;
public class DecimalToBinary
{
public static void main(String args[])
{
System.out.println("enter the number");

Scanner sc = new Scanner(System.in);

int num = sc.nextInt();

String decimalVal=Integer.toBinaryString(num);

System.out.println("Binary value" +decimalVal);

}
}
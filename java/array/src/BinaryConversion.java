import java.util.Scanner;

public class BinaryConversion
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int s=scanner.nextInt();
        System.out.println("binaty"+s+"=" +Integer.toBinaryString(s));
        System.out.println("Octal"+s+"="+Integer.toOctalString(s));
        System.out.println("Hexa"+s+"="+Integer.toHexString(s));
    }
}

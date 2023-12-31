
//linear search
import java.util.Scanner;
import java.util.Scanner;
public class FindMatchingNumber
{
    public static void main(String[] args)
    {
        int []a={6,8,9,7,6};
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
       int number= sc.nextInt();
        for ( i=0; i<a.length;i++)
        {
            if(number==a[i])
            {

                System.out.println(" found number is:" +a[i]);
                break;
            }

        }
        if(i==a.length)
        {
            System.out.println("not found");
        }
    }
}

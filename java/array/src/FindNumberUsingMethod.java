import java.util.Scanner;

public class FindNumberUsingMethod
{
    public static int findNumber(int number)
    {
    int []a={7,9,5,4,3};
    int c=number ;
    int count=0;
    for(int i=0;i<a.length;i++)
    {
        if(c ==a[i])
        {
            count++;
        }
    }
    return count;
    }
}

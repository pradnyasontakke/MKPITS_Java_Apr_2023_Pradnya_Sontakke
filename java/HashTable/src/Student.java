// wap to create one arrays list want these value from user and find load factors and display the list
import java.util.Arrays;
import java.util.Scanner;
public class Student {


    public static void main(String[] args)
    {

        int num[] = new int[10];
        Scanner scanner = new Scanner(System.in);
       int value;
        for (int count=0;count<10;count++)
        {
            System.out.println("enter the numbers");

            value = scanner.nextInt();
           num [value%10]=value;
        }
        for (int number:num)
        System.out.println(number);

    }

}
package Idpassword;

import java.util.Random;
import java.util.Scanner;

public class IdPassword
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the password");
        String str=((scanner.next()));
        System.out.println("Enter the password");
        String str1=((scanner.next()));

        if(str.equals(str1))
        {
            System.out.println("valid password");
        }
        else
        {
            System.out.println("Invalid password");
        }
    }
    }


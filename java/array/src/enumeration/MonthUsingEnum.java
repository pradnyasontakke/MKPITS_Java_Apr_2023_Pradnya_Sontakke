package enumeration;

import com.sun.jdi.Value;

import java.util.Scanner;

public class MonthUsingEnum
{
    enum Months {
        //declare enum list
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUN(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
       //when we write value in list then should be make constructor, otherwise not need to declare this m
        int days;
        //constructor
        Months(int days){
            this.days= days;
        }
    }
    public static void main(String[] args)
    {
        Months m=Months.AUGUST;
        // output in days
        System.out.println(m.days);

        for(Months md:Months.values())
        {
            System.out.println(md.ordinal() +""+ md.days + "" + md);
        }

        switch (m)
        {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("Month days are 31");
                break;
            case FEBRUARY:
                System.out.println("Month days are 28");
                break;
            case APRIL:
            case JUN:
            case SEPTEMBER:
            case NOVEMBER:
                System.out.println("Month days are 30");
                break;

        }
    }
}

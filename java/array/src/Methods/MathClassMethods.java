package Methods;
import java.math.*;
import java.util.*;
import java.lang.Math;
public class MathClassMethods
{
    public static void main(String[] args)
    {
        //math.abs
        int number1 = -55;
        int number2 = 66;
        System.out.println(Math.abs(number1));
        System.out.println(Math.abs(number2));
        System.out.println(Math.abs(-3.0));
//Math.max
        System.out.println(Math.max(number1,number2));
    //Math.min
        System.out.println(Math.min(number1,number2));
        //Math.round
        double number3=4.78d;
        System.out.println(Math.round(number3));

        //Marh.sqrt
        System.out.println(Math.sqrt(number1));
        System.out.println(Math.sqrt(number3));
        System.out.println(Math.cbrt(number3));
        //floor
        System.out.println(Math.floor(number3));
        //Math.ceil
        System.out.println(Math.ceil(number3));
    }
}

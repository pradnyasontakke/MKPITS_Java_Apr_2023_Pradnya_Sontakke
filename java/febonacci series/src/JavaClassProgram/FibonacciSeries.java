package JavaClassProgram;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        //declare a variable
        int number1=0,number2=1,number3;
        System.out.println("fibonacci series are");
        System.out.print(number1 +" "+ number2);

        for (int FibonacciNumber=2;FibonacciNumber<=10;++FibonacciNumber)
        {
            number3=number1+number2;
            System.out.print(" "+ number3);
            number1=number2;
            number2=number3;
        }
    }
}

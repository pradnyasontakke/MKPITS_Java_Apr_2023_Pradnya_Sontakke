package formatSpecifierAndStringFormating;

public class FormatSpecifier
{
    //recursion
//    static int i=0;
//    public static void display()
//    {
//        i++;
//        if(i<=5)
//        {
//            System.out.println("hello");
//            display();
//        }
//    }
    public static void main(String[] args) {
//        display();
        System.out.println(factorial(5));

        //we can use format specifier for the convert one data type to other
//     int marks=88;
//        System.out.println(String.format( "%010d",marks));
//        System.out.println(String.format("%s",marks));
//        System.out.println(String.format("%h",marks));


        //Stringpool
//        String str1="java";
//        String str2="java";
//        String str3=new String("java");
//        System.out.println(str1==str2);
//        System.out.println(str1==str3);


        //recursion
//        int i=0;
//        public static void display();
//        {}

    }
    static int f = 1;
    //factorial
    public static int factorial(int n)
    {
        while (n > 0) {
            f = f * n;
            n--;
        }
//        System.out.println("factorial" + 5);
        return f;
    }
}
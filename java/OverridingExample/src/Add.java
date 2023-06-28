import java.util.Scanner;

public class Add {

    static void myMethod(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is "+sum);
    }
    public static void main(String[] args) {

         myMethod();
    }
}

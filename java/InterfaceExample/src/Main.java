import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value");
        int value=scanner.nextInt();
        System.out.println(value);


//        Rectangle rectangle=new Rectangle(8);
//        rectangle.CalArea();
//        rectangle.displayColor();
//        Shape.displaySize();

        ExampleInterface3 exampleInterface3=new ExampleInterface3();
        exampleInterface3.display();

        }
    }

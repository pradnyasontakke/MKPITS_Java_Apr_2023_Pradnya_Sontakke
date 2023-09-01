import java.util.Scanner;

public class ExampleInterface3 implements ExampleInterface1,ExampleInterface2
{
    Scanner scanner=new Scanner(System.in);
    int choice=scanner.nextInt();
    @Override
    public void display() {
        ExampleInterface1.super.display();
    }
    //if not override then show the error implement method error




    }


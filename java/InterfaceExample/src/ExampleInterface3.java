import java.util.Scanner;

public class ExampleInterface3 implements ExampleInterface1,ExampleInterface2
{

    @Override
    public void display() {
        ExampleInterface1.super.display();
        ExampleInterface2.super.display();

    }
    //if not override then show the error implement method error





    }


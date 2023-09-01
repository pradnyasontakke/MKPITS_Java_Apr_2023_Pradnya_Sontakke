import java.util.Scanner;

public class Rectangle implements Shape{
int radius;

    public Rectangle(int radius) {
        this.radius=radius;
    }

    @Override
    public void CalArea() {
        System.out.println(3.14*radius*radius);
    }
     public void displayColor()
    {
        Shape.super.displayColor();
        System.out.println("white");
    }
    public void displaySize()
    {
        System.out.println(size);
    }
}

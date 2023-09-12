interface Circle
{
  void calArea(int r);         // abstract method call

  }
public class Circle1{
  public static void main(String[] args) {
    Circle circle=(r)->     //lambda syntax
      System.out.println("area is " + Math.PI *r* r);    //calculation part
     circle.calArea(9);       //call the method
  }

}
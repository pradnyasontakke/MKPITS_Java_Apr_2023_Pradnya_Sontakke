// A simple program to Test Interface default
// methods in java

abstract class  TestInterface
{
    // abstract method
   abstract void square(int a);
  void show(){
   System.out.println("show the result");}

    
}
  abstract class Test2{
	  public void run(){
		  System.out.println("show the result1");
		  
	  }
  }
class TestClass1 extends TestInterface        //, Test2 error is class TestClass1 extends TestInterface extends Test2   
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        TestClass1 d = new TestClass1();
        d.square(4);
  
        // default method executed
        d.show();
    }
}


// A simple program to Test Interface default
// methods in java

interface TestInterface
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
    class  Test2 implements TestInterface{
	       public void square(int a){
			    System.out.println("show the result2");
		   }

	  public void run(){
		  System.out.println("show the result1");
		  
	  }
  }
class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);
  
        // default method executed
        d.show();
		Test2 t2=new Test2();
    }
}


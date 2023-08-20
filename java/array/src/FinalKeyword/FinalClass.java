package FinalKeyword;

 public class FinalClass {
     private int num;
     public FinalClass()
     {
         num=100;
     }
      public void display()
    {

        System.out.println(num);
    }
}
 class NonFinalClass extends FinalClass {
     @Override
     public void display()
     {
         super.display();
     }

     public static void main(String[] args)
     {

         NonFinalClass nonFinalClass=new NonFinalClass();
         nonFinalClass.display();
     }

 }
 interface EvenOddRunnable  {
    void run();

 }
 public class EvenOddRunnabl {
     public static void main(String[] args) {

         Runnable runnable = new Runnable() {
             @Override
             public void run() {
                 System.out.println("even number ");
                 for (int i = 0; i < 10; i++) {
                     if (i%2==0){
                         System.out.println(i);
                     }
                 }
             }
         };
         runnable.run();

         Runnable runnable1 = new Runnable() {
             @Override
             public void run() {
                 System.out.println("odd number ");
                 for (int i = 0; i < 10; i++) {
                     if (i%2!=0){
                         System.out.println(i);
                     }
                 }
             }
         };
         runnable1.run();

                //using lambda expression
         EvenOddRunnable evenOddRunnable=()->
                 System.out.println("prints odd numbers");
         evenOddRunnable.run();
         for (int j=0;j<10;j++){
             if (j%2!=0)
             {
                 System.out.println(j);
             }
         }
     }
 }

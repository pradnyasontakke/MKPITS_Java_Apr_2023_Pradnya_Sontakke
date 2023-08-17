package ThreadPrograms;
//implementing thread using runnable interface
public class RunnableThread implements Runnable {
    public void run() {
        //infinite loop
        while (true) {
            //System.out.println("hello java programming");
            //or
            //print name in main class
            System.out.println(Thread.currentThread().getName());
           // System.out.println(Thread.currentThread().getPriority());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
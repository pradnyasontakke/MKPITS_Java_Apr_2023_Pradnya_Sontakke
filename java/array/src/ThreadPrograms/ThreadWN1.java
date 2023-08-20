package ThreadPrograms;

public class ThreadWN1 extends Thread
{
    public static void main(String[] args)
    {
        ThreadWN2 t2 = new ThreadWN2();
        t2.start();
        synchronized (t2)
        {
            try
            {
                System.out.println("waiting to be");
                t2.wait();
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("total is "+ t2.total);
        }
    }
}
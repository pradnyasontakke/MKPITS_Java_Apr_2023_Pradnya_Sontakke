package ThreadPrograms;

public class ThreadWN2 extends Thread
{
    int total;
    public void run()
    {
        synchronized (this) {
            for (int i = 0; i<=100; i++)
                total += i;
            notify();
        }

    }
}
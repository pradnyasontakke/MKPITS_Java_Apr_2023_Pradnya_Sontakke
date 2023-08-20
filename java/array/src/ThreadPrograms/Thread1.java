package ThreadPrograms;

public class Thread1 implements Runnable
{
    public void run()
    {
        System.out.println("odd numbers");
        for (int j=0;j<=100;j++)
        {
            if (j%2!=0)
                System.out.println("odd numbers"+j);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

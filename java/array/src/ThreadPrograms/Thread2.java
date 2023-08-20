package ThreadPrograms;
//ctrate 2 classes thread1 and thread2 implement using runnable  create run method, and
// write for loop one print odd and second print even
public class Thread2  implements Runnable
{
    public void run()
    {
        System.out.println("even number ");
        for (int i=0;i<=100;i++)
        {
            if (i %2==0)

                System.out.println("even numbers"+i);
            try{
                Thread.sleep(2000);

            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

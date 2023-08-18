package ThreadPrograms;
//second class is Threaded send
public class ThreadSender
{
    public synchronized void send(String msg)
    {
        System.out.println("sending "+ msg);

        System.out.println("sent "+msg);
    }
}

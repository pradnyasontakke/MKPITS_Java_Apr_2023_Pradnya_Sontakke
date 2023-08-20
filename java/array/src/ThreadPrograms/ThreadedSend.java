package ThreadPrograms;

public class ThreadedSend extends Thread
{
    private String msg;
    //object of ThreadSender class
    ThreadSender sender;
    ThreadedSend(String m,ThreadSender obj)
    {
       msg =m;
        sender= obj;
    }
    public void run() {
//        synchronized (sender)
//        {
            sender.send(msg);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


package ThreadPrograms;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //MyThread     parent execute first then execute child(priority)

        // System.out.println("Hii");
        //System.out.println(Thread.currentThread().getPriority());

//set name
        // MyThread mythread=new MyThread("pranish");
        // System.out.println("my name is " + myThread.getName());
//        myThread.setName("ThreadSetName");
        //  myThread.start();
        // System.out.println("bye" );
        //System.out.println(myThread.getpriority());
        //methods show the main name
        //System.out.println(Thread.currentThread().getName());
        //name of thread


//create object of RunnableThtrad
        //Thread thread=new Thread(new RunnableThread(),"runnable");
        //  thread.setPriority(6);
        //thread.start();
      //  System.out.println(Thread.activeCount());
        // System.out.println(thread.getId());


        //thread multi
//        Thread thread1=new Thread(new RunnableThread(),"thread11thread22thread33thread11thread22thread33");
//        Thread thread2=new Thread(new RunnableThread(),"java");
//       thread1.setPriority(1);
//        thread2.setPriority(10);
//        thread1.start();
//        thread2.start();
//        Thread thread1=new Thread(new Thread1());
//        Thread thread2=new Thread(new Thread2());
//        thread1.start();
//        thread2.start();


        //random numbergenerator
//Thread t=new Thread(String.valueOf(new RandomNumberGenerator()));
//t.start();


        //print the name
        //create object of thread
//        Thread t=new Thread(new ThreadPrintName(),"Thread1");
//        Thread t1=new Thread(new ThreadPrintName(),"Thread2");
//        t.start();
//        //join () used perform first wait for the dead and then execute, not a multitasking
//            t.join();
//        t1.start();


        //senser

//        ThreadSender obj=new ThreadSender();
//        ThreadedSend t1=new ThreadedSend("hii",obj);
//        ThreadedSend t2=new ThreadedSend("bye",obj);
//        t1.start();
//        t2.start();


        //using wait notify methods
//        ThreadWN1 t1=new ThreadWN1();
//        t1.start();
//        ThreadWN2 t2=new ThreadWN2();
//        t2.start();


        //ThreadWNS use wt notify method. synchronization is mandatory in wait and notify method
        ThreadWNS t = new ThreadWNS();
        t.start();
        synchronized (t)
        {
            t.wait();
        }
        System.out.println(t.total);
    }
}
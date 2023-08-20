package ThreadPrograms;
//create thread class
public class MyThread extends Thread
{
    public MyThread(String name) {
        //parent class cya method la call karanya sathi super keyword
        super(name);
    }

    //call run method
        public void  run()
        {
            System.out.println("hello java");

        }

    public int getpriority()
    {
        return 0;
    }
}

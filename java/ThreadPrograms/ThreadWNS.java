package ThreadPrograms;

public class ThreadWNS extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 100; i++) {
                total += i;
            }
            // this.notify();
        }
    }
}
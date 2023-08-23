package semaphore1;

public class Semaphore1P1 extends Thread{
    public void run() throws RuntimeException
    {
        int interation = 1000;
        while(interation-->0) {
            System.out.println("Non-critical Section 1");
            SemaphoreTest1.S.acquireUninterruptibly();
            System.out.println("Critical Section 1");
            SemaphoreTest1.S.release();
        }
    }
}

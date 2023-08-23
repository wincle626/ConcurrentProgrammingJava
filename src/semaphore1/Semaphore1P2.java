package semaphore1;

public class Semaphore1P2 extends Thread{
    public void run() throws RuntimeException
    {
        int interation = 1000;
        while(interation-->0) {
            System.out.println("Non-critical Section 2");
            SemaphoreTest1.S.acquireUninterruptibly();
            System.out.println("Critical Section 2");
            SemaphoreTest1.S.release();
        }
    }
}

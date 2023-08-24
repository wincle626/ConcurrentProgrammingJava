package semaphore2;

public class Semaphore2P2 extends Thread{
    public void run() throws RuntimeException {
        int interation = 1000;
        while (interation-- > 0) {
            System.out.println("Non-critical Section 1");
            SemaphoreTest2.S2.acquireUninterruptibly();
            SemaphoreTest2.S1.release();
            System.out.println("Critical Section 1");
        }
    }
}

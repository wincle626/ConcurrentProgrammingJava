package semaphore2;

import semaphore1.SemaphoreTest1;

public class Semaphore2P1 extends Thread{
    public void run() throws RuntimeException {
        int interation = 1000;
        while (interation-- > 0) {
            System.out.println("Non-critical Section 2");
            SemaphoreTest2.S2.release();
            SemaphoreTest2.S1.acquireUninterruptibly();
            System.out.println("Critical Section 2");
        }
    }
}

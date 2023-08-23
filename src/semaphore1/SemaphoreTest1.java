package semaphore1;

import java.util.concurrent.Semaphore;

public class SemaphoreTest1 {
    public static int slotLimit = 1;
    public static Semaphore S = new Semaphore(slotLimit);
    public static void run() {
        Thread p1 = new Semaphore1P1();
        Thread p2 = new Semaphore1P2();
        // start() will execute the run() methods once
        // but run() method can be called many times
        p1.start();
        p2.start();
    }
}

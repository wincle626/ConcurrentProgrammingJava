package semaphore2;

import semaphore1.Semaphore1P1;
import semaphore1.Semaphore1P2;

import java.util.concurrent.Semaphore;

public class SemaphoreTest2 {
    public static int slotLimit1 = 0;
    public static int slotLimit2 = 0;
    public static Semaphore S1 = new Semaphore(slotLimit1);
    public static Semaphore S2 = new Semaphore(slotLimit2);
    public static void run() {
        Thread p1 = new Semaphore2P1();
        Thread p2 = new Semaphore2P2();
        // start() will execute the run() methods once
        // but run() method can be called many times
        p1.start();
        p2.start();
    }
}

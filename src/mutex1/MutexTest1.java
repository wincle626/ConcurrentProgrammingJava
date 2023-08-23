package mutex1;

public class MutexTest1 {
//    public static int turn = 1;
    public static volatile int turn = 1;
    public static void run() {
        Thread p1 = new MutexTest1P1();
        Thread p2 = new MutexTest1P2();
        // start() will execute the run() methods once
        // but run() method can be called many times
        p1.start();
        p2.start();
    }
}

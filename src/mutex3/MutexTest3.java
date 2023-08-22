package mutex3;

public class MutexTest3 {
    public static int c1 = 1;
    public static int c2 = 1;
    public static void run() {
        Thread p1 = new MutexTest3P1();
        Thread p2 = new MutexTest3P2();
        // start() will execute the run() methods once
        // but run() method can be called many times
        p1.start();
        p2.start();
    }
}

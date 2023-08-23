package mutex4;

public class MutexTest4 {
//    public static int c1 = 1;
//    public static int c2 = 1;
    public static volatile int c1 = 1;
    public static volatile int c2 = 1;
    public static void run() {
        Thread p1 = new MutexTest4P1();
        Thread p2 = new MutexTest4P2();
        // start() will execute the run() methods once
        // but run() method can be called many times
        p1.start();
        p2.start();
    }
}

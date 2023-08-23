package mutex4;

public class MutexTest4P2 extends Thread{
    public void run()
    {
        int interation = 1000;
        while(interation-->0){
            System.out.println("Non-critical Section 2, c1="+ MutexTest4.c1+", c2="+MutexTest4.c2);
            MutexTest4.c2 = 0;
            while(MutexTest4.c1 != 1){
                MutexTest4.c2 = 1;
                MutexTest4.c2 = 0;
            }
            synchronized(this) {
                System.out.println("Critical Section 2, c1=" + MutexTest4.c1 + ", c2=" + MutexTest4.c2);
            }
            MutexTest4.c2 = 1;
        }
    }
}

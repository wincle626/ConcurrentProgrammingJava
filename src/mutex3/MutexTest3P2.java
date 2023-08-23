package mutex3;

public class MutexTest3P2 extends Thread{
    public void run()
    {
        int interation = 1000;
        while(interation-->0){
            System.out.println("Non-critical Section 2, c1="+ MutexTest3.c1+", c2="+MutexTest3.c2);
            MutexTest3.c2 = 0;
            while(MutexTest3.c1 != 1){}
            synchronized(this) {
                System.out.println("Critical Section 2, c1=" + MutexTest3.c1 + ", c2=" + MutexTest3.c2);
            }
            MutexTest3.c2 = 1;
        }
    }
}

package mutex2;

public class MutexTest2P1 extends Thread{
    public void run()
    {
        int interation = 1000;
        while(interation-->0){
            System.out.println("Non-critical Section 1, c1="+MutexTest2.c1+", c2="+MutexTest2.c2);
            while(MutexTest2.c1 != 1){}
            MutexTest2.c1 = 0;
            synchronized(this) {
                System.out.println("Critical Section 1, c1=" + MutexTest2.c1 + ", c2=" + MutexTest2.c2);
            }
            MutexTest2.c1 = 1;
        }
    }
}

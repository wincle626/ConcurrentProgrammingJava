package mutex3;

import mutex2.MutexTest2;

public class MutexTest3P2 extends Thread{
    public void run()
    {
        int interation = 5;
        while(interation-->0){
            System.out.println("Non-critical Section 2, c1="+ MutexTest2.c1+", c2="+MutexTest2.c2);
            MutexTest2.c2 = 0;
            while(MutexTest2.c1 != 1){
            }
            System.out.println("Critical Section 2, c1="+MutexTest2.c1+", c2="+MutexTest2.c2);
            MutexTest2.c2 = 1;
        }
    }
}

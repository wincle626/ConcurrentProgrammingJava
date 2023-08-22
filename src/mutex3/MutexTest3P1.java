package mutex3;

import mutex2.MutexTest2;

public class MutexTest3P1 extends Thread{
    public void run()
    {
        int interation = 5;
        while(interation-->0){
            System.out.println("Non-critical Section 1, c1="+ MutexTest2.c1+", c2="+MutexTest2.c2);
            MutexTest2.c1 = 0;
            while(MutexTest2.c1 != 1){
            }
            System.out.println("Critical Section 1, c1="+MutexTest2.c1+", c2="+MutexTest2.c2);
            MutexTest2.c1 = 1;
        }
    }
}

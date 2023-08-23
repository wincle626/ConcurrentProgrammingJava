package mutex1;

public class MutexTest1P2 extends Thread{
    public void run()
    {
        int interation = 1000;
        while(interation-->0){
            System.out.println("Non-critical Section 2, turn="+ MutexTest1.turn);
            while(MutexTest1.turn == 1){}
            synchronized(this) {
                System.out.println("Critical Section 2, turn=" + MutexTest1.turn);
            }
            MutexTest1.turn = 1;
            System.out.println("Exit loop, turn=" + MutexTest1.turn);
        }
    }
}

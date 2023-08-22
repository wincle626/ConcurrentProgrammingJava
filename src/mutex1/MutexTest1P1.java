package mutex1;

public class MutexTest1P1 extends Thread{
    public void run()
    {
        int interation = 1000;
        while(interation-->0){
            System.out.println("Non-critical Section 1, turn="+ MutexTest1.turn);
            while(MutexTest1.turn == 2){}
            synchronized(this) {
                System.out.println("Critical Section 1, turn=" + MutexTest1.turn);
            }
            MutexTest1.turn = 2;
            System.out.println("Exit Critical Section 1, turn=" + MutexTest1.turn);
        }
    }
}

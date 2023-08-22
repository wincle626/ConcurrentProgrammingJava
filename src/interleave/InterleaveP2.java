package interleave;

public class InterleaveP2 extends Thread {
    // initiated run method for Thread
    public void run()
    {
        InterleaveTest.c1 = InterleaveTest.c1 + InterleaveTest.c2;
        System.out.println(
                Thread.currentThread().getName()
                +", ThreadGroup="+Thread.currentThread().getThreadGroup()
                +", State="+Thread.currentThread().getClass()
                +", Priority="+Thread.currentThread().getPriority()
                +", State="+Thread.currentThread().getState()
                +", Interleave.c1="+ InterleaveTest.c1);
    }
}

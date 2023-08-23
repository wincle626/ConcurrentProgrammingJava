package interleave;

public class InterleaveP1 extends Thread {
    // initiated run method for Thread
    public void run()
    {
        InterleaveTest.c1 = InterleaveTest.c1 * InterleaveTest.c2;
        System.out.println("InterleaveP1->"
                +Thread.currentThread().getName()
                +", ThreadGroup="+Thread.currentThread().getThreadGroup()
                +", State="+Thread.currentThread().getClass()
                +", Priority="+Thread.currentThread().getPriority()
                +", State="+Thread.currentThread().getState()
                +", c1="+ InterleaveTest.c1
                +", c2="+ InterleaveTest.c2);
    }
}
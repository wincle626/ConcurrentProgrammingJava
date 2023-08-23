package dekker;

public class DekkerTestP2 extends Thread{
    public void run()
    {
        int interation = 1000;
        while(interation-->0){
            System.out.println("Non-critical Section 2, c1="+ DekkerTest.c1+", c2="+ DekkerTest.c2);
            DekkerTest.c2 = 0;
            while(DekkerTest.c1 != 1){
                if(DekkerTest.turn==1) {
                    DekkerTest.c2 = 1;
                    while(DekkerTest.turn!=2){}
                    DekkerTest.c2 = 0;
                }
            }
            synchronized(this) {
                System.out.println("Critical Section 2, c1=" + DekkerTest.c1 + ", c2=" + DekkerTest.c2);
            }
            DekkerTest.c2 = 1;
            DekkerTest.turn = 1;
        }
    }
}

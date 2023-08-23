package dekker;

public class DekkerTestP1 extends Thread{
    public void run()
    {
        int interation = 1000;
        while(interation-->0){
            System.out.println("Non-critical Section 1, c1="+ DekkerTest.c1+", c2="+ DekkerTest.c2);
            DekkerTest.c1 = 0;
            while(DekkerTest.c2 != 1){
                if(DekkerTest.turn==2) {
                    DekkerTest.c1 = 1;
                    while(DekkerTest.turn!=1){}
                    DekkerTest.c1 = 0;
                }
            }
            synchronized(this) {
                System.out.println("Critical Section 1, c1=" + DekkerTest.c1 + ", c2=" + DekkerTest.c2);
            }
            DekkerTest.c1 = 1;
            DekkerTest.turn = 2;
        }
    }
}

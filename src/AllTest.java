import dekker.DekkerTest;
import interleave.*;
import mutex1.*;
import mutex2.*;
import mutex3.*;
import mutex4.*;
import semaphore1.*;

public class AllTest {
    public static int index = 5;
    public static void main(String[] args) {
        switch (index) {
            case 0 -> InterleaveTest.run();
            case 1 -> MutexTest1.run();
            case 2 -> MutexTest2.run();
            case 3 -> MutexTest3.run();
            case 4 -> MutexTest4.run();
            case 5 -> DekkerTest.run();
            case 6 -> SemaphoreTest1.run();
        }
    }
}

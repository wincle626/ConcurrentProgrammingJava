import interleave.*;
import mutex1.*;
import mutex2.*;
import mutex3.*;

public class AllTest {
    public static int index = 1;
    public static void main(String[] args) {
        switch (index) {
            case 0 -> {
                for (int i = 0; i < 2; i++) {
                    InterleaveTest.run();
                }
            }
            case 1 -> MutexTest1.run();
            case 2 -> MutexTest2.run();
            case 3 -> MutexTest3.run();
        }
    }
}

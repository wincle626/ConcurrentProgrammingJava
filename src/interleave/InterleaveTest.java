// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
package interleave;
public class InterleaveTest {
    public static int c1 = 2;
    public static int c2 = 3;
    public static void run() {
        Thread p1 = new InterleaveP1();
        Thread p2 = new InterleaveP2();
        // start() will execute the run() methods once
        // but run() method can be called many times
        p1.start();
        p2.start();
        System.out.println("Final c1="+c1+", c2="+c2);
    }
}
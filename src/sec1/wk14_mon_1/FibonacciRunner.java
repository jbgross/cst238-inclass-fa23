package sec1.wk14_mon_1;
import com.google.common.base.Stopwatch;


import java.util.*;
public class FibonacciRunner {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
//        long f3 = f.getRecursive(3);
//        long f4 = f.getRecursive(4);
//        long f5 = f.getRecursive(5);
//        System.out.println(f3);
//        System.out.println(f4);
//        System.out.println(f5);
        Scanner in = new Scanner(System.in);

        int nth;
        do {
            System.out.print("Enter a number: ");
            nth = in.nextInt();
            Stopwatch sw = Stopwatch.createStarted();
            long l1 = f.getIterative(nth + 1);
            sw.stop();
            System.out.printf("Iterative Fibonacci %d: %d (%s) %n", nth, l1, sw);
            sw.reset();
            sw.start();
            long l2 = f.getRecursive(nth);
            sw.stop();
            System.out.printf("Recursive Fibonacci %d: %d (%s) %n", nth, l2, sw);
            sw.reset();
            sw.start();
            long l3 = f.getDynamic(nth);
            sw.stop();
            System.out.printf("Dynamic Fibonacci %d: %d (%s) %n", nth, l3, sw);
        } while(nth != 0);


    }
}

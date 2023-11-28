package sec2.wk14_mon_2;

import com.google.common.base.Stopwatch;

import java.util.Scanner;

public class FibonacciRunner {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        long f3 = f.getIterative(3);
        System.out.println(f3);
        long f4 = f.getIterative(4);
        System.out.println(f4);
        long f6 = f.getIterative(6);
        System.out.println(f6);

        f6 = f.getRecursive(5);
        System.out.println(f6);
        Scanner in = new Scanner(System.in);
        int nth;
        do {
            System.out.print("Enter a number: ");
            nth = in.nextInt();
            Stopwatch si = Stopwatch.createStarted();
            long it = f.getIterative(nth + 1);
            si.stop();
            System.out.printf("Iterative %d Fibonacci: %d (%s)%n",
                    nth, it, si);
            Stopwatch sr = Stopwatch.createStarted();
            long re = f.getRecursive(nth);
            sr.stop();
            System.out.printf("Recursive %d Fibonacci: %d (%s)%n",
                    nth, re, sr);
            Stopwatch sd = Stopwatch.createStarted();
            long dy = f.getDynamic(nth);
            sd.stop();
            System.out.printf("Dynamic %d Fibonacci: %d (%s)%n",
                    nth, dy, sd);
        } while(nth != 0);
    }
}

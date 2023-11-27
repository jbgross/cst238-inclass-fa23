package sec1.wk14_mon_1;
import  java.util.*;
// 0, 1, 1, 2, 3, 5, 8, 13, 21,
public class Fibonacci {

    private List<Long> fibonacciSequence;

    public Fibonacci() {
        fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add((long) 0);
        fibonacciSequence.add((long) 1);
    }

    public long getDynamic(int nth) {
        if(fibonacciSequence.size() <= nth) {
            fibonacciSequence.add(getDynamic(nth - 2) + getDynamic(nth - 1));
        }
        return fibonacciSequence.get(nth);
    }

    public long getRecursive(int nth) {
//        System.out.println("computing f " + nth);
        if(nth == 0) {
            return 0;
        } else if(nth == 1) {
            return 1;
        } else {
            return getRecursive(nth - 2) + getRecursive(nth - 1);
        }
    }

    public long getIterative(int nth) {
        long b1 = 0;
        long b2 = 1;
        for(int i = 2; i < nth; i++) {
//            System.out.println(b1 + " " + b2);
            long temp = b2;
            b2 = b1 + b2;
            b1 = temp;
        }
        return b2;
    }
}

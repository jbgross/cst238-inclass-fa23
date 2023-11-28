package sec2.wk14_mon_2;
import java.util.*;

// 0, 1, 1, 2, 3, 5, 8, 13, 21
public class Fibonacci {

    private List<Long> fibonacciSequence;

    public Fibonacci() {
        fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add((long) 0);
        fibonacciSequence.add((long) 1);
    }

    public long getDynamic(int nth) {
        if(fibonacciSequence.size() <= nth) {
            // generate fibonacci number
            long nthFib = getDynamic(nth - 2) + getDynamic(nth - 1);
            fibonacciSequence.add(nthFib);
        }
        return fibonacciSequence.get(nth);
    }

    public long getRecursive(int nth) {
//        System.out.println("getting " + nth + " recursively");
        if(nth == 0) {
            return 0;
        } else if(nth == 1) {
            return 1;
        } else {
            return getRecursive(nth - 2) + getRecursive(nth - 1);
        }
    }

    public long getIterative(int nth) {
        long a1 = 0, a2 = 1;
        for(int i = 2; i < nth; i++) {
            long temp = a2;
            a2 = a1 + a2;
            a1 = temp;
        }
        return a2;
    }

}

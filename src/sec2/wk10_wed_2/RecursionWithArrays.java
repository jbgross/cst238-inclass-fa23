package sec2.wk10_wed_2;
import java.util.*;
public class RecursionWithArrays {

    public static void main(String[] args) {
        int [] a = new int[10];
        Random r = new Random(12);
        load(a, r, a.length, 20);
        print(a, 0);
        int [] b = {4, 5};
        System.out.println("Sum: " + sum(a, 0));
        System.out.println("Max: " + max(a, 0));
        System.out.println("MaxIndex: " + maxIndex(a, 0));
//        print(b, b.length);
    }

    public static int maxIndex(int [] a, int start) {
        if(start == a.length -1) {
            return start;
        }
        int maxIndexOfRemaining = maxIndex(a, start + 1);
        if(a[start] >=  a[maxIndexOfRemaining]) {
            return start;
        } else {
            return maxIndexOfRemaining;
        }
    }

    public static int max(int [] a, int start) {
        if(start == a.length - 1) {
            return a[start];
        }
        return Math.max(a[start], max(a, start + 1));
//        int maxInRemainingArray = max(a, start + 1);
//        if(a[start] > maxInRemainingArray) {
//            return a[start];
//        } else {
//            return maxInRemainingArray;
//        }
    }

    public static int sum(int [] a, int start) {
        if(start == a.length) {
            return 0;
        } else {
            return a[start] + sum(a, start + 1);
        }
    }

    public static void print(int [] a, int start) {
        if(start == a.length) {
            System.out.println();
            return;
        } else {
            System.out.print(a[start] + " ");
            print(a, start + 1);
        }
    }

    public static void load(int [] a, Random r, int size, int bound) {
        if(size == 0) {
          return;
        } else {
            a[size - 1] = r.nextInt(bound);
            load(a, r, size - 1, bound);
        }
    }
}

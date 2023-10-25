package sec1.wk10_wed_1;

import java.util.Random;

public class RecursionWithArrays {
    public static void main(String[] args) {
        int [] a = new int[10];
        Random r = new Random(12);
        load(r, a, 0, 20);
        print(a, a.length);
        System.out.println("sum: " + sum(a, 0));
        System.out.println("max: " + max(a, 0));
        System.out.println("maxIndex: " + maxIndex(a, 0));
    }

    public static int maxIndex(int [] a, int start) {
        if(start == a.length - 1) {
            return start;
        }
//        return Math.max(a[start], max(a, start + 1));
        int maxIndexRemaining = maxIndex(a, start + 1);
        if(a[start] >= a[maxIndexRemaining]) {
            return start;
        } else {
            return maxIndexRemaining;
        }


    }
    public static int max(int [] a, int start) {
        if(start == a.length - 1) {
            return a[start];
        }
        return Math.max(a[start], max(a, start + 1));
//        int maxOfRemainingElements = max(a, start + 1);
//        if(a[start] > maxOfRemainingElements) {
//            return a[start];
//        } else {
//            return maxOfRemainingElements;
//        }
    }

    public static int sum(int [] a, int start) {
        if(start == a.length) {
            return 0;
        } else {
            return a[start] + sum(a, start + 1);
        }
    }

    public static void print(int [] a, int size) {
        if(size == 0) {
            System.out.println();
        } else {
            System.out.print(a[size - 1] + " ");
            print(a, size - 1);
        }
    }

    public static void load(Random r, int [] a, int start, int bound) {
        if(start >= a.length) {
            return;
        } else {
            a[start] = r.nextInt(bound);
            load(r, a, start + 1, bound);
        }
    }
}

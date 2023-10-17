package sec2.wk09_mon_2;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int [] data = generateData(20);
        print(data);
        bubbleSort(data);
        print(data);
    }

    public static void bubbleSort(int [] a) {
        for(int k = 0; k < a.length - 1; k++) {
            System.out.println("inner loop " + (k+1) + ": ");
            for (int i = 0; i < a.length - 1 - k; i++) {
                System.out.printf("\tcomparing %d (%d) -> %d (%d) - ", i, a[i], i+1, a[i+1]);
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    System.out.println("swapped");
                } else {
                    System.out.println("not swapped");
                }
            }
        }
    }

    public static void swap(int [] a, int index1, int index2) {
        int temp = a[index2];
        a[index2] = a[index1];
        a[index1] = temp;
    }

    public static void print(int [] a) {
        for(int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static int [] generateData(int size) {
        int [] a = new int[size];
        Random r = new Random(0);
        for(int i = 0; i < a.length; i++) {
//            int x = a[i];
            a[i] = r.nextInt(size*2);
        }
        return a;
    }
}

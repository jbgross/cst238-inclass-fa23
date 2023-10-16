package sec1.wk09_mon_1;

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
            System.out.printf("next inner loop - k is %d\n", k);
            for (int i = 0; i < a.length - 1 - k; i++) {
                System.out.printf("\tCompare %d (%d) to %d (%d) - ", i, a[i], i + 1, a[i + 1]);
                if (a[i] > a[i + 1]) {
                    System.out.println("swapping");
                    swap(a, i, i + 1);
                } else {
                    System.out.println("not swapping");
                }
            }
        }
    }

    public static void swap(int [] a, int index1, int index2) {
        int temp = a[index2];
        a[index2] = a[index1];
        a[index1] = temp;
    }

    public static int [] generateData(int size) {
        int [] a = new int[size];
        Random r = new Random(0);
        for(int i = 0; i < size; i++) {
            a[i] = r.nextInt(size * 2);
        }
        return a;
    }

    public static void print(int [] a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

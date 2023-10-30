package sec1.wk11_mon_1;
import java.util.*;
public class InsertionSort {

    public static void main(String[] args) {
        int [] data = makeData(new Random(6), 20);
        print(data);
        insertionSort(data);
        print(data);
    }

    public static void insertionSort(int [] data) {
        int swaps = 0, comps = 0;
        for(int i = 1; i < data.length; i++) {
            int k = i;

            while(k > 0 ) {
                comps++;
                if(data[k] < data[k - 1]) {
                    swaps++;
                    swap(data, k, k - 1);
                    k--;
                } else {
                    break;
                }
                // using expression "++comps != 0" entirely for
                // the side effect of accurately counting
                // comparisons of array elements
//            while(k > 0 && ++comps != 0 && data[k] < data[k - 1]) {
//                comps++;
//                swaps++;
//                swap(data, k, k - 1);
//                k--;
            }
        }
        System.out.printf("swaps: %d comps: %d\n", swaps, comps);
    }


    public static void swap(int [] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

    public static void print(int [] data) {
        for(int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int [] makeData(Random r, int size) {
        int [] data = new int[size];
        for(int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(-20, 20);
        }
        return data;
    }
}

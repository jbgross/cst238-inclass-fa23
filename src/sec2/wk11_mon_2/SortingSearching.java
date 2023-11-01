package sec2.wk11_mon_2;
import java.util.*;
public class SortingSearching {

    public static void main(String[] args) {
        int [] data = makeData(new Random(6), 20);
        print(data);
        insertionSort(data);
        print(data);
        System.out.printf("index of %d is %d\n", 16,
                binarySearch(data, 16, 0, data.length - 1));
        System.out.printf("index of %d is %d\n", -2,
                binarySearch(data, -2, 0, data.length - 1));
    }

    public static void print(int [] data) {
        for(int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int [] a, int value, int start, int stop) {
        if(start > stop) {
            return -1;
        }

        int midIndex = (start + stop)/2;
        if(a[midIndex] == value) {
            return midIndex;
        } else if(a[midIndex] < value) {
            // value must belong in the second half
             return binarySearch(a, value,  midIndex + 1, stop);
        } else {
            // value must belong in the first half
            return binarySearch(a, value, start, midIndex - 1);
        }
    }

    public static void insertionSort(int [] data) {
        int comps = 0, swaps = 0;
        for(int i = 1; i < data.length; i++) {
            int k = i;
//            comps++;
            while(k > 0 && ++comps != 0 && data[k] < data[k-1]) {
//                comps++;
                swaps++;
                swap(data, k, k - 1);
                k--;
            }
        }
        System.out.printf("comps: %d swaps: %d\n", comps, swaps);
    }

    public static void swap(int [] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

    public static int [] makeData(Random r, int size) {
        int [] data = new int[size];
        for(int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(-20, 20);
        }
        return data;
    }
}

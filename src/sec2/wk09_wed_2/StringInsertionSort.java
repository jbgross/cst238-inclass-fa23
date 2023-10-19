package sec2.wk09_wed_2;

import java.io.*;
import java.util.*;

public class StringInsertionSort {
    public static void main(String[] args) throws IOException {
        String [] data = load("src/sec2/wk09_wed_2/data.txt");
        print(data);
        insertSort(data);
        print(data);
        double u1 = 0.0859163;
        double u2 = 859163.0004;
        System.out.printf("[%f] - [%f]\n", u1, u2);
        System.out.printf("[%15f] - [%15f]\n", u1, u2);
        System.out.printf("[%-15f] - [%-15f]\n", u1, u2);
        System.out.printf("[%5.2f] - [%5.2f]\n", u1, u2);
    }

    public static void insertSort(String [] a) {
        for(int i = 1; i < a.length; i++) {
            int k = i;
            while(k > 0 && a[k].length() < a[k - 1].length()) {
                swap(a, k, k - 1);
                k--;
            }
        }
    }

    public static void swap(String [] a, int i1, int i2) {
        String temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

    public static String [] load(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        int size = fs.nextInt();
        String [] data = new String[size];
        for(int i = 0; i < data.length; i++) {
            data[i] = fs.next();
        }
        fr.close();
        return data;
    }

    public static void print(String [] a) {
        for(String word : a) {
            System.out.printf("%s (%d)\n", word, word.length());
        }
        System.out.println();
    }

}


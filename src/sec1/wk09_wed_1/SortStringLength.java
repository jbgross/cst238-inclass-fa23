package sec1.wk09_wed_1;

import java.io.*;
import java.util.*;
public class SortStringLength {
    public static void main(String[] args) throws IOException {
        String [] data = loadStrings("src/sec1/wk09_wed_1/data.txt");
        print(data);
        insertionSort(data);
        print(data);
        double u1 = 0.0859163;
        double u2 = 859163.0004;
        System.out.printf("%f %f%n", u1, u2);
        System.out.printf("%18f %18f%n", u1, u2);
        System.out.printf("%-18f %-18f%n", u1, u2);
        System.out.printf("%.2f %.2f%n", u1, u2);
        System.out.printf("%5.2f %5.2f%n", u1, u2);
        String s = String.format("%5.2f %5.2f%n", u1, u2);
        System.out.println(s);
    }

    public static void insertionSort(String [] a) {
        for(int i = 1; i < a.length; i++) {
            int k = i;
            while(k > 0 && a[k].length() < a[k - 1].length()) {
                // swap
                swap(a, k, k -1);
                k--;
            }
        }
    }

    public static void swap(String [] a, int index1, int index2) {
        String temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static String [] loadStrings(String filename) throws IOException
    {
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
        for(String s : a) {
            System.out.printf("%s (%d)\n", s, s.length());
        }
        System.out.println();
    }

}

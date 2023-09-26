package sec2.wk06_mon_2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int [] a = {5, -7, 42, 9000, -65, 8, 5, 5, -7, 5, 200, 42, 8, 21};
        Scanner s = new Scanner(System.in);
        int input = -1;
        while(input != 0) {
            System.out.print("Enter a number to search for (0 to quit): ");
            input = s.nextInt();
            System.out.println(linearSearch(a, input));
        }
    }

    public static int linearSearch(int [] data, int value) {
//        int index = -1;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == value) {
                return i;
//                index = i;
            } /*else {
                return -1;
            }*/
        }
        return -1;
//        return index;
    }

    public static int lastSearch(int [] data, int value) {
        for(int i = data.length - 1; i >= 0; i--) {
            if(data[i] == value) {
                return i;
            }
        }
        return -1;
//        int index = -1;
//        for(int i = 0; i < data.length; i++) {
//            if(data[i] == value) {
//                index = i;
//            }
//        }
//        return index;
    }
}

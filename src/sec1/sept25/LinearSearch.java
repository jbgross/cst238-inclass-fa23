package sec1.sept25;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int [] data = {5, 2, -40, -65, 3001, 17, 5, -3};
        Scanner s = new Scanner(System.in);
        int value = -1;
        while(value != 0) {
            System.out.print("Enter a number (0 to quit): ");
            value = s.nextInt();
            System.out.println(lastSearch(data, value));
        }
    }

    public static int linearSearch(int [] data, int value) {
        for(int i = 0; i < data.length; i++) {
//            return value == data[i];
            if(value == data[i]) {
                return i;
            } /*else {
                return false;
            }*/
        }
        return -1;
    }

    public static int lastSearch(int [] data, int value) {
        int index = -1;
        for(int i = 0; i < data.length; i++) {
            if(value == data[i]) {
                index = i;
            }
        }
        return index;
    }
}

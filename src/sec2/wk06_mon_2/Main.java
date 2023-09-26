package sec2.wk06_mon_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] a = {5, -7, 42, 9000, -65, 8, 5, 5, -7, 5, 200, 42, 8, 21};
        List l = new List();
        for(int i = 0; i < a.length; i++) {
            l.append(a[i]);
        }
        System.out.println(l);
        Scanner s = new Scanner(System.in);
        int input = -1;
        while(input != 0) {
            System.out.print("Enter a number to search for (0 to quit): ");
            input = s.nextInt();
            System.out.println(l.linearSearch(input));
        }

    }
}

package sec2.wk13_mon_2;

import java.util.Random;

public class BSTRunner {
    public static void main(String[] args) {
        BST b1 = new BST();
        System.out.printf("(5, %b) (7, %b) (2, %b)\n",
                b1.search(5), b1.search(7), b1.search(2));
        b1.add(5);
        System.out.printf("(5, %b) (7, %b) (2, %b)\n",
                b1.search(5), b1.search(7), b1.search(2));
        b1.add(7);
        System.out.printf("(5, %b) (7, %b) (2, %b)\n",
                b1.search(5), b1.search(7), b1.search(2));
        b1.add(2);
        System.out.printf("(5, %b) (7, %b) (2, %b)\n",
                b1.search(5), b1.search(7), b1.search(2));
        b1.inOrder();
        System.out.println();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            int x = r.nextInt(0, 21);
            System.out.println("adding " + x);
            b1.add(x);
        }
        System.out.println();
        b1.inOrder();
        System.out.println("count of evens: " + b1.countEvens());
    }
}

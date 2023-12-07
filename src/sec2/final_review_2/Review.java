package sec2.final_review_2;

import java.util.*;
public class Review {
    private static int secret = 4;

    public static void main(String[] args) {
        Review.foo();
        Review r = new Review();
        r.foo();

        Random rand = new Random(7);
        List l = new List();
        Queue q = new Queue();

        for(int i = 0; i < 5; i++) {
            l.append(rand.nextInt(21));
            q.enqueue(rand.nextInt(21));
        }
        System.out.println(l);

        java.util.List<Integer> al = new ArrayList();
        for(int i = 0; i < 5; i++) {
            al.add(rand.nextInt(20));
            q.enqueue(rand.nextInt(21));
        }
        System.out.println(al);
        System.out.println(q);
    }

    public static int search(int [] a, int value) {
        BST<Integer> b = new BST<>();
//        for(int i = 0; i < a.length; i++) {
//            if(a[i] == value) {
//                return true;
////            } else {
////                return false;
//            }
//        }
//        return false;
        int start = 0;
        int stop = a.length - 1;
        while(start <= stop) {
            int midpoint = (start + stop)/2;
            int midvalue = a[midpoint];
            if(value == midvalue) {
                return midpoint;
            } else if(value < midvalue) {
                // must be in the first half
                stop = midpoint - 1;
            } else {
                start = midpoint + 1;
            }
        }
        return start;
    }

    public static void foo() {
        secret++;
        System.out.println("called foo()");
    }
}

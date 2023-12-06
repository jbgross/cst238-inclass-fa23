package sec1.final_review;
import java.util.*;
public class Review {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        for(int i = 0; i < 5; i++) {
            bt.add(i);
        }
        bt.inOrder();
        System.out.println(bt.sum());

        Map<String, BinaryTree> m = new HashMap<>();
        m.put("foo", bt);
        m.put("bar", bt);
        m.values();
    }

    public static boolean linearSearch(int [] data, int value) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int [] data, int value) {
        int start = 0;
        int stop = data.length - 1;

        while(start <= stop) {
            int middle = (start + stop)/2;
            int middleValue = data[middle];
            if(middleValue == value) {
                return middle;
            } else if(value > middleValue) {
                // must be in the last half of the remaining data
                start = middle + 1;
            } else {
                stop = middle - 1;
            }
        }
        return start;
    }
}

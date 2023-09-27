package sec1.wk06_wed_1;
import java.lang.reflect.Array;
import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        load(al, in);
        Collections.sort(al);
        System.out.println(al);
        int value = -1;
        while(value != 0) {
            System.out.print("Search for value: ");
            value = in.nextInt();
            System.out.println(linearSearch(al, value));
            System.out.println(binarySearch(al, value));
        }
    }

    public static int binarySearch(ArrayList<Integer> a, int value) {
        System.out.print("Binary Search - ");
        int comparisons = 0;
        int start = 0;
        int stop = a.size() - 1;
        while(start <= stop) {
            comparisons++;
            int middle = (start + stop)/2;
//            System.out.printf("Start: %d - Middle: %d - Stop: %d\n",
//                    start, middle, stop);
            int mValue = a.get(middle);
            if(mValue == value) {
                System.out.print("Comparison: " + comparisons + " - ");
                return middle;
            } else if(mValue > value) {
                // value must be in the first half
                stop = middle - 1;
            } else {
                // value must be in the second half
                start = middle + 1;
            }
        }
        System.out.print("Comparison: " + comparisons + " - ");
        return -1;
    }

    public static int linearSearch(ArrayList<Integer> a, int value) {
        System.out.print("Linear Search - ");
        int comparisons = 0;
        for(int i = 0; i < a.size(); i++) {
            comparisons++;
            if(a.get(i) == value) {
                System.out.print("Comparison: " + comparisons + " - ");
                return i;
            }
        }
        System.out.print("Comparison: " + comparisons + " - ");
        return -1;
    }

    public static void load(ArrayList<Integer> a, Scanner in) {
        System.out.print("How many values? ");
        int count = in.nextInt();
        System.out.print("Max value for range? ");
        int max = in.nextInt();
        Random rand = new Random(0);
        for(int i = 0; i < count; i++) {
            a.add(rand.nextInt(max));
        }

    }
}

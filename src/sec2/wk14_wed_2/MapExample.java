package sec2.wk14_wed_2;
import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> data = new TreeMap<>();
        String [] words = {"coffee", "ranch", "monkey", "syrup", "dictionary"};
        Random r = new Random(5);
        for(String value : words) {
            int key = r.nextInt();
            System.out.println("adding " + value + " with key " + key);
            data.put(key, value);
        }
        data.put(4, "hello");
//        System.out.println(data.get(4));
        Scanner in = new Scanner(System.in);
        int search;
        do {
            System.out.print("Enter key to search for: ");
            search = in.nextInt();
            System.out.println("key " + search + " has a value " +
                    data.get(search));
        } while (search != 0);

        for(Integer key : data.keySet()) {
//            System.out.print(key + " ");
            System.out.println(key + " -> " +
                    data.get(key));
        }
        System.out.println();
    }
}

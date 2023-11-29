package sec1.wk14_wed_1;
import java.util.*;
public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> data = new TreeMap<>();
        String [] words = {"hello", "goodbye", "ciao", "buenosdias", "aloha"};
        Random r = new Random(0);
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            int key = r.nextInt(25);
            System.out.println(key + " " + words[i]);
//            System.out.print("Enter word: ");
//            String value = s.next();
            data.put(key, words[i]);
        }

        for(Integer i : data.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();
        int input;
        do {
            System.out.print("Enter key: ");
            input = s.nextInt();
            if(data.containsKey(input)) {
                String value = data.get(input);
                System.out.println(value);
            } else {
                System.out.println("No value for key " + input);
            }
        } while(input != 0);
    }
}

package sec2.wk05_mon_2;

import java.io.*;

public class Paths_Sept18_2 {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("1.txt");
//        Stack s = new Stack();
        System.out.println(isMatched("())#"));
    }

    public static boolean isMatched(String input) {
        Stack s = new Stack();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == '(') {
                s.push(c);
            } else if(c == ')' && ! s.isEmpty()) {
                s.pop();
            } else if(c == ')') {
                return false;
            } else if(c == '#') {
                break;
            }
        }
        if(! s.isEmpty()) {
            System.out.println(s);
            return false;
        }
        return true;
    }
    public static char foo() {
        return 0;
    }
}

package sec1.sept18;



public class ParenMatching {
    public static void main(String[] args) {
        String input = "(()))#";
        System.out.println(matchParens(input));
    }

    public static boolean matchParens(String input) {
        Stack s = new Stack();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == '(') {
                s.push(c);
            } else if (c == ')' && ! s.isEmpty()) {
                s.pop();
            } else if(c == '#') {
                break;
            } else if(c == ')') {
                return false;
            }
        }
        System.out.println(s);
        return s.isEmpty();
    }
}

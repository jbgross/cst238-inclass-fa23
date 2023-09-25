package sec1.sept25;

public class Main {
    public static void main(String[] args) {
        List l = new List();
//        System.out.println(l.data.length);
        int [] data = {5, 2, -40, -65, 3001, 17, 5, -3};
        for(int i = 0; i < data.length; i++) {
            l.append(data[i]);
        }
        System.out.println(l);
        System.out.println(l.linearSearch(5));
        System.out.println(l.lastSearch(5));
    }
}

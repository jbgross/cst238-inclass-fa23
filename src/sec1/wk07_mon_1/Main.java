package sec1.wk07_mon_1;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Civic", 1994);
        Car c2 = new Car("Ford", "F150", 2024);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
        Car c3 = c1;
        System.out.println(c1.getCarCount());
        Car c4 = new Car("Porsche", "911");
        System.out.println(c3.getCarCount());
//        StringBuffer s = new StringBuffer("hi");
//        System.out.println(s);
//        foo(s);
//        System.out.println(s);
//
//        String t = "hi";
//        System.out.println(t);
//        bar(t);
//        System.out.println(t);

    }

    public static void foo(StringBuffer s) {
        System.out.println(s);
        s.append("ciao");
        System.out.println(s);
    }

    public static void bar(String t) {
        System.out.println(t);
        t = "ciao";
        System.out.println(t);
    }
}

package sec2.wk07_mon_2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Civic");
        Car c2 = new Car("Tesla", "Cybertruck", 2024);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c2.getCarCount());
        Car c3 = new Car("Kia", "Soul");
        System.out.println(c3);
        System.out.println(c1.getCarCount());
//        Car.carCount = 0;
        System.out.println(Car.getCarCount());
//        String s = "hi";
//        System.out.println(s);
//        foo(s);
//        System.out.println(s);
//
//        StringBuffer sb = new StringBuffer("bye");
//        System.out.println(sb);
//        bar(sb);
//        System.out.println(sb);
//
//        System.out.println(s.toUpperCase());
//        String t = s.toUpperCase();
//        System.out.println(t);
//        System.out.println(s);
//        s = s.toUpperCase();
//        System.out.println(s);
    }

    public static void foo(String s) {
        System.out.println(s);
        s = "ciao";
        System.out.println(s);
    }

    public static void bar(StringBuffer sb) {
        System.out.println(sb);
        sb.append("good");
        System.out.println(sb);
    }
}

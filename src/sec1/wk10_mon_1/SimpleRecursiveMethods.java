package sec1.wk10_mon_1;

public class SimpleRecursiveMethods {

    public static void main(String[] args) {
//        int [] a;
//        System.out.println(a);
//        a = new int[5];
//        a[2] = 7;
//        a = new int[5];
//        System.out.println(a[2]);
//        System.out.println(sum());
//        printFoo();
        printBar(-5);
    }

    public static void printBar(int count) {
        if(count < 1) {
            return;
        } else {
            System.out.println("bar");
            printBar(count - 1);
        }
    }

    public static int sum() {
        int x = 0;
        x++;
        return 1 + sum();
    }

    public static void printFoo() {
        System.out.println("foo");
        printFoo();
    }
}

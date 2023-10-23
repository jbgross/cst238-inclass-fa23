package sec2.wk10_mon_2;

public class SimpleRecursiveMethods {
    public static void main(String[] args) {
//        printBar();
//        sum();
        printFoo(5);
    }

    public static void printFoo(int count) {
//        if(count > 0) {
//            System.out.println("foo");
//            printFoo(count - 1);
//        }
//        return;
        if(count <= 0) {
            return;
        } else {
            System.out.println("foo");
            printFoo(count - 1);
        }
    }

    public static int sum() {
        int sum = 0;
        ++sum;
        return 1 + sum();
    }

    public static void printBar() {
        System.out.println("bar");
        printBar();
    }
}

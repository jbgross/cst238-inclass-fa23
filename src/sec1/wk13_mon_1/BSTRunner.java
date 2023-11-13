package sec1.wk13_mon_1;

public class BSTRunner {

    public static void main(String[] args) {
        BST b1 = new BST();
        System.out.println("searching for 5: " + b1.search(5));
        System.out.println("searching for 2: " + b1.search(2));
        System.out.println("searching for 7: " + b1.search(7) + "\n");
        b1.add(5);
        System.out.println("searching for 5: " + b1.search(5));
        System.out.println("searching for 2: " + b1.search(2));
        System.out.println("searching for 7: " + b1.search(7) + "\n");
        b1.add(2);
        System.out.println("searching for 5: " + b1.search(5));
        System.out.println("searching for 2: " + b1.search(2));
        System.out.println("searching for 7: " + b1.search(7) + "\n");
        b1.add(7);
        System.out.println("searching for 5: " + b1.search(5));
        System.out.println("searching for 2: " + b1.search(2));
        System.out.println("searching for 7: " + b1.search(7) + "\n");

        b1.add(12);
        System.out.println("searching for 10: " + b1.search(10) + "\n");

        b1.inOrder();

    }
}

package sec1.wk11_wed_1;

public class Runner {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll);
        ll.append(5);
        System.out.println(ll);
        ll.append(10);
        System.out.println(ll);
        ll.append(15);
        ll.append(20).append(25).append(30);
        System.out.println(ll);
        System.out.println("count of evens: " + ll.countEvens());
    }
}

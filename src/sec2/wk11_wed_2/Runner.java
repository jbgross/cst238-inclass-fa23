package sec2.wk11_wed_2;

public class Runner {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll);
        ll.append(5);
        System.out.println(ll);
        ll.append(10);
        ll.append(15);
        ll.append(20).append(25).append(30);
        System.out.println(ll);
        System.out.println("count of evens: " + ll.countEvens());
    }
}

package sec1.wk07_wed_1;

public class Main {
    public static void main(String[] args) {
        List l = new List();
        for(int i = 0; i < 10; i++) {
            l.append(3 * (i + 1));
        }
        System.out.println(l);
        l.insert(1, 7.5);
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
//        Queue q1 = new Queue();
//        for(int i = 0; i < 12; i++) {
//            q1.enqueue(i);
//        }
//        System.out.println(q1);
//
//        while(! q1.isEmpty()) {
//            System.out.println(q1.front());
//            q1.dequeue();
//        }
//        System.out.println(q1);
//
//        Queue q2 = new Queue();
//        q2.enqueue(5);
//        q2.enqueue(7);
//        q2.enqueue(9);
//        System.out.println(q2);
//        q2.dequeue();
//        q2.dequeue();
//        q2.enqueue(12);
//        q2.enqueue(14);
//        q2.enqueue(16);
//        System.out.println(q2);
    }
}

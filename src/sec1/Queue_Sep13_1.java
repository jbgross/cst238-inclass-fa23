package sec1;

/* this is a comment */
public class Queue_Sep13_1 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue("hello");
        for(int i = 0; i < 10; i++) {
            q.enqueue((i + 1) * 5 + "");
        }
        System.out.println(q);

        while(! q.isEmpty()) {
            System.out.println(q.front());
            q.dequeue();
        }
        System.out.println(q);
    }
}

class Queue {
    private String [] data;
    private int front;
    private int back;
    private static final int QUEUE_CAPACITY = 10;

    public Queue() {
        data = new String[QUEUE_CAPACITY];
        front = 0;
        back = 0;
    }

    public void enqueue(String s) {
        int newBack = (back + 1)%data.length;
        if(newBack == front) {
            System.out.println("Queue full, cannot enqueue " + s);
            return;
        }

        data[back] = s;
        back = newBack;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty queue";
        } else {
            StringBuffer sb = new StringBuffer();
            for(int i = front; i != back; i = (i + 1 )% data.length) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue empty, cannot dequeue");
            return;
        }
        data[front] = null;
        front = (front + 1)%data.length;
    }

    public String front() {
        if(isEmpty()) {
            System.out.println("Queue empty, no front value");
            return null;
        }

        return data[front];
    }
}
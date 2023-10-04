package sec1.wk07_wed_1;

public class Queue {
    private int front;
    private int back;

    private int[] data;

    public Queue() {
        front = 0;
        back = 0;
        data = new int[10];
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(int value) {
        int nextBack = (back + 1) % data.length;
        if (nextBack == front) {
            System.out.println("Queue full - cannot enqueue"
                + value);
            return;
        }
        data[back] = value;
        back = nextBack;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty queue - cannot dequeue");
            return;
        }

        // data[front] = null; // only for object arrays
        front = (front + 1) % data.length;
    }

    public int front() {
        if(isEmpty()) {
            System.out.println("Empty queue - no value");
            return -1;
        }

        return data[front];
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty queue";
        }
        StringBuffer sb = new StringBuffer();
        for(int i = front; i != back; i = (i+1)%data.length) {
            sb.append(data[i]).append(" ");
        }

        return sb.toString();
    }
}

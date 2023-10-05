package sec2.wk07_wed_2;

public class Queue {
    private Coffee [] drinks;
    private int front;
    private int back;

    public Queue() {
        drinks = new Coffee[10];
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(Coffee c) {
        int nextBack = (back + 1)%drinks.length;
        if(nextBack == front) {
            System.out.println("Queue is full, cannot enqueue " + c);
            return;
        }

        drinks[back] = c;
        back = nextBack;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Empty queue, cannot dequeue");
            return;
        }

        drinks[front] = null; // wouldn't use for an array of primitive
        front = (front + 1)%drinks.length;
    }

    public Coffee front() {
        if(isEmpty()) {
            System.out.println("Empty queue, no coffee for you");
            return null;
        }
        return drinks[front];
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty queue";
        }
        StringBuffer sb = new StringBuffer();
        sb.append("front: ").append(front).append(" - back: ").append(back);
        sb.append("\n");
//        for(int i = 0; i < drinks.length; i++) {
        for(int i = front; i != back; i = (i+1)%drinks.length) {
            sb.append(drinks[i]).append(" ");
        }
        return sb.toString();
    }
}

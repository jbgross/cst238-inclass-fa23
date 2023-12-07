package sec2.final_review_2;

public class Queue {

    private int front;
    private int back;

    private int [] data;

    public Queue() {
        data = new int[10];
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(int value) {
        int nextBack = (back + 1)%data.length;
        if(nextBack == front) {
            System.out.println("Sorry, queue full");
        } else {
            data[back] = value;
            back = nextBack;
        }
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty queue";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = front; i != back; i = (i+1)%data.length) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}

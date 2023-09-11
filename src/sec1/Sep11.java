package sec1;

public class Sep11 {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s);
        s.push(5);
        System.out.println(s.isEmpty());
        System.out.println(s.top());
        for(int i = 0; i < 10; i++) {
            s.push((i+1) * 5);
        }
        System.out.println(s);
//        s.pop();
        while(! s.isEmpty()) {
            System.out.println("\tpopping " + s.top());
            s.pop();
        }
        System.out.println(s.isEmpty());
    }
}

class Stack {
    private int [] data;
    private int top;
    private static final int STACK_CAPACITY = 10;

    public Stack() {
//        data[0] = 5;
        data = new int[STACK_CAPACITY];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if(top < data.length - 1) {
            // stack is not full
//            top++;
            data[++top] = value;
        } else {
            System.out.println("Stack is full! Cannot push " + value);
        }
    }

    public int top() {
        if(isEmpty()) {
            System.out.println("Stack empty; cannot retrieve top value");
            return -1;
        } else {
            return data[top];
        }
    }


    public void pop() {
        if(isEmpty()) {
            System.out.println("Cannot pop empty stack!");
        } else {
            top--;
        }
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty stack";
        } else {
            StringBuffer sb = new StringBuffer();
            for(int i = top; i >= 0; i--) {
                sb.append(data[i]).append(" ");
            }
            sb.append("\n");
            return sb.toString();
        }
    }

}

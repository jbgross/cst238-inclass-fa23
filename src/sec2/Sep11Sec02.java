package sec2;

public class Sep11Sec02 {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(0);
        System.out.println(s.isEmpty());
        System.out.println(s.top());
        for(int i = 0; i < 10; i++) {
            s.push((i+1) * 5);
        }
        System.out.println(s);
        while(! s.isEmpty()) {
            System.out.println("\t" + s.top());
            s.pop();
        }
        System.out.println(s);

    }
}

class Stack {
    private int [] data;
    private int top;
    private static final int STACK_CAPACITY = 10;

    public Stack() {
//        data[0] = 4;
//        STACK_CAPACITY = 15;
        data = new int[STACK_CAPACITY];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if(top < data.length - 1) {
            // stack is NOT full
//            top++;
            data[++top] = value;
        } else {
            System.out.println("Stack full cannot push value " + value);
        }
    }

    public int top() {
        if(isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        } else {
            return data[top];
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack empty, can't pop");
        } else {
            // data[top] = null;
            top--;
        }
    }

    public String toString() {
        if(isEmpty()) {
            return "Stack is empty";
        } else {
            StringBuffer sb = new StringBuffer();
            for(int i = top; i >= 0; i--) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

}
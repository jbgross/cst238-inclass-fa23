package sec1.sept18;

public class Stack {
    private int top;
    private char [] data;
    private static final int STACK_CAPACITY = 10;

    public Stack() {
        top = -1;
        data = new char[STACK_CAPACITY];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char value) {
        if(top + 1 == data.length) {
            System.out.println("Cannot push, stack full");
            return;
        }
        data[++top] = value;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Cannot pop, stack empty");
            return;
        }
        top--;
    }

    public char top() {
        if(isEmpty()) {
            System.out.println("Cannot pop, stack empty");
            return 0;
        }
        return data[top];
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty stack";
        } else {
            StringBuffer sb = new StringBuffer();
            for(int i = top; i >= 0; i--) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

}

package sec2.sept18;

public class Stack {
    public char [] data;
    public int top;
    public static final int STACK_CAPACITY = 10;

    public Stack() {
        data = new char[STACK_CAPACITY];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char value) {
        if(top == data.length - 1) {
            System.out.println("Stack full, cannot push");
            return;
        }
        data[++top] = value;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack empty, cannot pop");
            return;
        }
        top--;
    }


    public char top() {
        if(isEmpty()) {
            System.out.println("Empty stack, no top");
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

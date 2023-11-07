package sec2.wk12_review;

public class LinkedList {
    private Node first;
//    private Node last;

    public LinkedList() {
        first = null;
//        last = null;
    }

    public int countEvens() {
        if(isEmpty()) {
            return 0;
        } else {
            int count = 0;
            Node n = first;
            while(n != null) {
                if(n.getData() % 2 == 0) {
                    count++;
                }
                n = n.getNext();
            }
            return count;
        }
    }

    public LinkedList append(int data) {
        if(isEmpty()) {
            first = new Node(data);
        } else {
            first.append(data);
        }
        return this;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty list";
        } else {
            StringBuilder sb = new StringBuilder();
            Node n = first;
            while(n != null) {
                sb.append(n).append(" -> ");
                n = n.getNext();
            }
            System.out.println(n);
            sb.append("null");
            return sb.toString();
        }
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void append(int value) {
        if(! hasNext()) {
            next = new Node(value);
        } else {
            next.append(value);
        }
    }

    public boolean hasNext() {
        return next != null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public String toString() {
        return Integer.toString(data);
    }

}
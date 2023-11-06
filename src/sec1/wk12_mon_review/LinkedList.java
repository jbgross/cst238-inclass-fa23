package sec1.wk12_mon_review;

public class LinkedList {
    private Node first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void append(int value) {
        if (isEmpty()) {
            first = new Node(value);
        } else {
            first.append(value);
        }
    }

    public int sum() {
        if(isEmpty()) {
            return 0;
        } else {
            return first.sum();
        }
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int value) {
        data = value;
        next = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public int sum() {
        if(! hasNext()) {
            return data;
        } else {
            return data + next.sum();
        }
    }

    public void append(int value) {
        if(! hasNext()) {
            // I'm the last node, so make the new node
            // the new last node, which is my next node
            next = new Node(value);
        } else {
            next.append(value);
        }
    }
}
package sec1.wk11_wed_1;

public class LinkedList {
    private Node first;

    public LinkedList() {
        first = null;
    }

    public LinkedList append(int data) {
        if(isEmpty()) {
            first = new Node(data);
        } else {
            Node n = first;
            while(n.hasNext()) {
                n = n.getNext();
            }
            n.setNext(new Node(data));
        }
        return this;
    }

    public int countEvens() {
        if(isEmpty()) {
            return 0;
        } else {
            int count = 0;
            Node n = first;
            while(n != null) {
                if(n.getData()%2 == 0) {
                    count++;
                }
                n = n.getNext();
            }
            return count;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty list";
        } else {
            StringBuffer sb = new StringBuffer();
            Node n = first;
            while(n != null) {
                sb.append(n).append(" -> ");
                n = n.getNext();
            }
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

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public boolean hasNext() {
        return next != null;
    }

    public String toString() {
        return Integer.toString(data);
    }
}
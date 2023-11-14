package sec2.wk13_mon_2;

public class Node {
    private double data;
    private Node left;
    private Node right;

    public Node(double value) {
        data = value;
        left = null;
        right = null;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public void inOrder() {
        if(hasLeft()) {
            left.inOrder();
        }
        System.out.print(data + " ");
        if(hasRight()) {
            right.inOrder();
        }
    }

    public boolean search(double value) {
        if(value == data) {
            return true;
        } else if(value < data) {
            // would be to the left
            if(hasLeft()) {
                return left.search(value);
            } else {
                return false;
            }
        } else {
            if(hasRight()) {
                return right.search(value);
            } else {
                return false;
            }
            // would be to the right
        }
    }

    public void add(double value) {
        if(value < data) {
            // go to the left
            if(hasLeft()) {
                left.add(value);
            } else {
                left = new Node(value);
            }
        } else if(value > data) {
            // go to the right
            if(hasRight()) {
                right.add(value);
            } else {
                right = new Node(value);
            }
        }
        // ignore duplicates
    }
}

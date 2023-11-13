package sec1.wk13_mon_1;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int value) {
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

    public boolean search(int value) {
        System.out.printf("comparing %d to node containing %d\n", value, data);
        if(value == data) {
            return true;
        } else if(value < data) {
            // value would be to left
            if(hasLeft()) {
                return left.search(value);
            } else {
                return false;
            }
        } else {
            // value would be to right
            if(hasRight()) {
                return right.search(value);
            } else {
                return false;
            }
        }
    }

    public void add(int value) {
        if(value < data) {
            // go to left
            if(hasLeft()) {
                left.add(value);
            } else {
                left = new Node(value);
            }
        } else if(value > data) {
            // go to right
            if(hasRight()) {
                right.add(value);
            } else {
                right = new Node(value);
            }
        }
        // ignore duplicates
    }


}

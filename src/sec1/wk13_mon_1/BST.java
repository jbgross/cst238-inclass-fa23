package sec1.wk13_mon_1;

public class BST {

    private Node root;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean search(int value) {
        if(isEmpty()) {
            return false;
        } else {
            return root.search(value);
        }
    }

    public void add(int value) {
        if(isEmpty()) {
            root = new Node(value);
        } else {
            root.add(value);
        }
    }

    public void inOrder() {
        if(isEmpty()) {
            System.out.println("Empty tree");
        } else {
            root.inOrder();
            System.out.println();
        }
    }
}

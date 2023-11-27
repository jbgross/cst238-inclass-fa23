package sec2.wk13_mon_2;

public class BST {

    private Node root;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int countEvens() {
        if(isEmpty()) {
            return 0;
        } else {
            return root.countEvens();
        }
    }

    public int height() {
        if(isEmpty()) {
            return 0;
        } else {
            return root.height();
        }
    }

    public void inOrder(){
        if(isEmpty()) {
            System.out.println("Empty tree");
        } else {
            root.inOrder();
            System.out.println();
        }
    }

    public boolean search(double value) {
        if(isEmpty()) {
            return false;
        } else {
            return root.search(value);
        }
    }

    public BST add(int value) {
        if(isEmpty()) {
            root = new Node(value);
        } else {
            root.add(value);
        }
        return this;
    }
}

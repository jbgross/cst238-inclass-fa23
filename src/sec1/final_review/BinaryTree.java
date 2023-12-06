package sec1.final_review;

public class BinaryTree {
    private Node root;

    public boolean isEmpty() {
        return root == null;
    }
    public void add(int value) {
        if(isEmpty()) {
            root = new Node(value);
        } else {
            root.add(value);
        }
    }

    public int sum() {
        if(isEmpty()) {
            return 0;
        } else {
            return root.sum();
        }
    }

    public void inOrder() {
        if(isEmpty()) {
            System.out.println("empty list");
        } else {
            root.inOrder();
        }
    }
}

class Node {
    private int data;
    private Node left;
    private Node right;
    private boolean lastLeft;

    public Node(int value) {
        data = value;
        left = null;
        right = null;
        lastLeft = false;
    }

    public void add(int value) {
        if(lastLeft) {
            lastLeft = false;
            if(right == null) {
                right = new Node(value);
            } else {
                right.add(value);
            }
            return;
        }
        lastLeft = true;
        if(left == null) {
            left = new Node(value);
        } else {
            left.add(value);
        }
    }

    public int sum() {
        int localAccumulator = data;
        if(left != null) {
            localAccumulator += left.sum();
        }

        if (right != null) {
            localAccumulator += right.sum();
        }

        System.out.println("localAccumulator: " + localAccumulator);
        return localAccumulator;
    }

    public int sumNoLocal() {
        if(left != null && right != null) {
            return data + left.sumNoLocal() + right.sumNoLocal();
        } else if(left != null) {
            return data + left.sumNoLocal();
        } else if(right != null){
            return data + right.sumNoLocal();
        } else {
            return data;
        }
    }

    public void inOrder() {
        if(left != null) {
            left.inOrder();
        }
        System.out.println(data);
        if(right != null) {
            right.inOrder();
        }
    }

}
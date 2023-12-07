package sec2.final_review_2;

public class BST<T> {
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

class Node<T> {
    private int data;
    private Node left;
    private Node right;
    private boolean lastLeft;

    public Node(int value) {
        data = value;
        left = null;
        right = null;
//        lastLeft = false;
    }

    public boolean search(int value) {
        if(value == data) {
            return true;
        } else if(value < data) {
            if(left != null) {
                return left.search(value);
            }
        } else {
            if(right != null) {
                return right.search(value);
            }
        }
        return false;
    }
    public void add(int value) {
        if(value < data) {
            if(left == null) {
                left = new Node(value);
            } else {
                left.add(value);
            }
        } else if(value > data) {
            if(right == null) {
                right = new Node(value);
            } else {
                right.add(value);
            }
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

    public boolean balanced(int [] a) {
        return balanced(a, a.length -1) == 0;
    }

    public int balanced(int [] a, int index) {
        if(index < 0) {
            return 0;
        } else if(a[index] < 0) {
            return -1 + balanced(a, index - 1);
        } else if(a[index] > 0) {
            return +1 + balanced(a, index - 1);
        } else {
            return balanced(a, index - 1);
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
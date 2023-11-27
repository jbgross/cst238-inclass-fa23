package sec2.wk13_mon_2;

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

    public boolean isLeaf() {
        return ! (hasLeft() || hasRight());
    }

    public int height() {
        if(isLeaf()) {
            return 1;
        } else if(hasLeft() && hasRight()) {
            return 1 + Math.max(left.height(), right.height());
        } else if(hasLeft()) {
            return 1 + left.height();
        } else {
            return 1 + right.height();
        }
//        int h = 1;
//        int l = 0;
//        if(hasLeft()) {
//            l = left.height();
//        }
//
//        int r = 0;
//        if(hasRight()) {
//            r = right.height();
//        }
//
//        return h + Math.max(l, r);
    }

    public int countEvens() {
        int evenCount = 0;
        if(data % 2 == 0) {
            evenCount++;
        }

        if(hasLeft()) {
            evenCount += left.countEvens();
        }

        if(hasRight()) {
            evenCount += right.countEvens();
        }

        return evenCount;
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

    public void add(int value) {
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

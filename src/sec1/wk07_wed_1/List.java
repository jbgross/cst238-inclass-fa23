package sec1.wk07_wed_1;

public class List {
    private double [] data;
    private int size;

    public List() {
        data = new double[10];
        size = 0;
    }

    private void resize() {
        System.out.println("Resizing from " + data.length + " to "
            + data.length * 2);
        // create new array
        double [] copy = new double[data.length * 2];

        // copy from old array to new
        for(int i = 0; i < size; i++) {
            copy[i] = data[i];
        }

        // assign new array to existing variable
        data = copy;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void append(double value) {
        if(isFull()) {
            resize();
//            System.out.println("List full, cannot append " + value);
//            return;
        }
        data[size++] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void insert(int location, double value) {
        if(isFull()) {
            resize();
//            System.out.println("List full, cannot insert " + value);
//            return;
        }
        if(location < 0 || location > size) {
            System.out.println("Invalid index, cannot insert "
                    + value + " at index " + location);
            return;
        }

        for(int i = size; i > location; i--) {
            data[i] = data[i-1];
        }

        data[location] = value;
        size++;
    }

    public void remove(int location) {
        if(isEmpty()) {
            System.out.println("Invalid index, cannot remove from index "
                    + location);
            return;
        }

        if(location < 0 || location > size - 1) {
            System.out.println();
        }

        for(int i = location; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
        // data[size] = null; // for object arrays


    }

    public String toString() {
        if(isEmpty()) {
            return "Empty list";
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }

        return sb.toString();
    }
}

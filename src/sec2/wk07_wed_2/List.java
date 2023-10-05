package sec2.wk07_wed_2;

public class List {
    private double [] data;
    private int size;

    public List() {
        data = new double[10];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(double value) {
        if(size == data.length) {
            System.out.println("Full list, cannot append " + value);
            return;
        }

        data[size++] = value;
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

package sec2.final_review_2;

public class List {

    private int [] data;
    private int size;

    public List() {
        data = new int[10];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int value) {
        if(size == data.length) {
            System.out.println("nope! list full");
            return;
        }

        data[size++] = value;
//        size++;
    }

    public String toString() {
        if(isEmpty()) {
            return "empty list!";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}

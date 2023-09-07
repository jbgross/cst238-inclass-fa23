package sec2;

public class Sep06 {
    public static void main(String[] args) {
        List l = new List();
        l.append("hello");
        l.append("goodbye");
        System.out.println(l);
        for(int i = 0; i < 10; i++) {
            l.insert("" + i, 0);
            System.out.println(l);
        }
        l.get(10);
    }
}

class List {

    private String [] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public List() {
//        data[0] = "hello";
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public List(int capacity) {
        data = new String[capacity];
        size = 0;
    }

    public void append(String value) {
        data[size++] = value;
//        size++;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(size).append(" elements: ");
        for(int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }

    public void insert(String value, int pos) {
        if(size == data.length) {
            System.out.println("list full");
            return;
        }
        if(pos < 0 || pos > size) {
            System.out.println("Invalid index");
            return;
        }

        // shift
        for(int i = size; i > pos; i--) {
            data[i] = data[i-1];
        }
        data[pos] = value;
        size++;
    }

    public String get(int index) {
        if(index < 0 || index >= size) {
            return null;
        }
        return data[index];
    }
}

package sec1;

import java.util.*;

class Sep06 {
    public static void main(String[] args) {
        List l = new List();
        l.append("foo");
        l.append("bar");

        // System.out.println(l.get(10));
        for(int i = 0; i < 10; i++) {
            //l.insert(0, "" + i);
            l.append("" + i);
            System.out.println(l);
        }
    }
}

class List{

    private String [] data;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public List() {
        data = new String[DEFAULT_SIZE];
        size = 0;
    }

    public String get(int pos) {
        if(pos < 0 || pos >= size) {
            System.out.println("index " + pos +
                    " is not valid");
            return null;
        }
        return data[pos];
    }

    public void append(String value) {
        if(size < data.length) {
            data[size++] = value;
        }
    }

    public void insert(int pos, String value) {
        if(pos < 0 || pos > size || size >= data.length) {
            System.out.println("index " + pos +
                    " is not valid");
            return;
        }

        // shift to the right
        for(int i = size; i > pos; i--) {
            data[i] = data[i - 1];
        }
        data[pos] = value;
        size++;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(size).append(" elements: ");
        for(int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
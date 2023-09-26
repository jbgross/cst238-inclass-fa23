package sec1.wk06_mon_1;

public class List {
    private int size;
    private int [] data;
    private int maxValue;
    private static final int DEFAULT_CAPACITY = 10;

    public List() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
        maxValue = Integer.MIN_VALUE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int value) {
        data[size++] = value;
        if(value > maxValue) {
            maxValue = value;
        }
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty list";
        } else {
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < size; i++) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

    public int linearSearch(int value) {
        for(int i = 0; i < size; i++) {
//            return value == data[i];
            if(value == data[i]) {
                return i;
            } /*else {
                return false;
            }*/
        }
        return -1;
    }

    public int lastSearch(int value) {
        int index = -1;
        for(int i = 0; i < size; i++) {
            if(value == data[i]) {
                index = i;
            }
        }
        return index;
    }

    public int max() {
        return maxValue;
//        int max = Intege  r.MIN_VALUE;
//        for(int i = 0; i < size; i++) {
//            if(max < data[i]) {
//                max = data[i];
//            }
//        }
//        return max;
    }

}

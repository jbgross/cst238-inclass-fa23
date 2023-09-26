package sec2.wk06_mon_2;

public class List {
    private int [] data;
    private int size;
    private int maxValue = Integer.MIN_VALUE;
    public static final int DEFAULT_CAPACITY = 15;

    public List() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void append(int value) {
        if(size == data.length) {
            System.out.println("Can't add " + value + "; full list");
            return;
        }
        data[size++] = value;
        if(value > maxValue) {
            maxValue = value;
        }
    }

    public String toString() {
        if(size == 0) {
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
            if(data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int lastSearch(int value) {
        for(int i = size - 1; i >= 0; i--) {
            if(data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int maxValue() {
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < size; i++) {
//            if(data[i] > max) {
//                max = data[i];
//            }
//        }
//        return max;
        return maxValue;
    }

}

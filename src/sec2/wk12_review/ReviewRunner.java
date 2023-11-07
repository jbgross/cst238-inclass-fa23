package sec2.wk12_review;


public class ReviewRunner {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll);
        ll.append(5);
        System.out.println(ll);
        ll.append(10);
        ll.append(15);
        ll.append(20).append(25).append(30);
        System.out.println(ll);
        System.out.println("count of evens: " + ll.countEvens());
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8};
        print(a);
        move(a, 0, 5);
        print(a);
        move(a, 5, 0);
        print(a);

        System.out.println(sum(a));
        System.out.println(sum(a, 0));
    }

    public static void fastInsertionSort(int [] a) {
        for(int i = 1; i < a.length; i++) {
            int k = i;
            for(; k > 0 && a[i] < a[k]; k--){

            }
            move(a, i, k);
        }
    }

    public static int sum(int [] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int sum(int [] a, int start) {
        if(a.length == start) {
            return 0;
        } else {
            return a[start] + sum(a, start + 1);
        }
    }

    public static void print(int [] a) {
        for(int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void move(int [] a, int start, int stop) {
        if(stop > start) {
            int temp = a[start];
            for (int i = start; i < stop; i++) {
                a[i] = a[i + 1];
            }
            a[stop] = temp;
        } else if(start > stop) {
            int temp = a[start];
            for(int i = start; i > stop; i--) {
                a[i] = a[i - 1];
            }
            a[stop] = temp;
        }
    }
}

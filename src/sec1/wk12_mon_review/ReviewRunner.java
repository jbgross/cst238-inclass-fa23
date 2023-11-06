package sec1.wk12_mon_review;

import java.util.*;

public class ReviewRunner {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll.sum());
        ll.append(17);
        ll.append(-5);
        ll.append(22);
        System.out.println(ll.sum());
        StudentScore s1 = new StudentScore(98);
//        System.out.println(s1);
        StudentScore s2 = new StudentScore(95);
//        System.out.println(s2);
//        System.out.println(s1.compareTo(s2));
        StudentScore [] scores = new StudentScore[5];
        scores[0] = s1;
        scores[1] = s2;
        scores[2] = new StudentScore(34);
        scores[3] = new StudentScore(71);
        scores[4] = new StudentScore(0);
        print(scores);
        bubbleSort(scores);
        print(scores);
        StudentScore a = new StudentScore(100);
        StudentScore b = new StudentScore(89);
        System.out.println(binarySearch(scores, a));
        System.out.println(a);
        System.out.println(binarySearch(scores, b));
        System.out.println(b);
        ArrayList<StudentScore> scoreList = new ArrayList<>();
        for(StudentScore s : scores) {
            scoreList.add(0, s);
        }
        System.out.println(scoreList);
        Collections.sort(scoreList);
        System.out.println(scoreList);
//        int x = 'x';
//        System.out.println(x);
//        int y = 121;
//        System.out.println(y);
//        System.out.println((char) y);
        Pair<Integer> pi = new Pair<>(1, 5);
    }

    public static int sumScores(StudentScore [] scores) {
        int sum = 0;
        for(StudentScore s: scores) {
            sum += s.getScore();
        }
        return sum;
    }

    public static int sumScores(StudentScore [] scores, int start) {
        if(start >= scores.length) {
            return 0;
        } else {
            return scores[start].getScore() + sumScores(scores, start + 1);
        }
    }

    public static boolean binarySearch(StudentScore [] a, StudentScore value) {
        int start = 0;
        int stop = a.length - 1;
        while(start <= stop) {
            int mid = (start + stop)/2;
            if (a[mid].equals(value)) {
                return true;
            } else if(a[mid].compareTo(value) > 0) {
                stop = mid - 1;
            } else {
                // must come in second half of search space
                start = mid + 1;
            }
        }
        return false;
    }

    public static void print(StudentScore [] scores) {
        for(StudentScore s : scores) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public static void bubbleSort(StudentScore [] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int k = 0; k < a.length - 1 - i; k++) {
                if(a[k].compareTo(a[k + 1]) > 0) {
                    swap(a, k, k + 1);
                }
            }
        }
    }

    public static void swap(StudentScore [] a, int i1, int i2) {
        StudentScore temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
}

package sec2.wk08_mon_2;

import java.util.*;

public class BookSortTest {
    public static void main(String[] args) {
        Book b1 = new Book("A Wrinkle in Time",
                "Madeleine L'Engle", "SF", 200);
        Book b2 = new Book("Martian", "Andy Weir", "SF", 320);
        Book b3 = new Book("Dune", "Frank Herbert", "SF", 8000);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        ArrayList<Book> al = new ArrayList<>();
        al.add(b1);
        al.add(b2);
        al.add(b3);
        al.add(new Book("Very Long Book", "Some Person", "Boring", 500));
        System.out.println(b1.equals(b1));
        System.out.println(b1.equals(b2));
        System.out.println(b3.equals(new Book("Dune",
                "Frank Herbert", "scifi", 8000)));
//        System.out.println(al);
        for(Book b : al) {
            System.out.print(b.getPageCount() + ", ");
        }
        System.out.println();
        Collections.sort(al);
        for(Book b : al) {
            System.out.print(b.getPageCount() + ", ");
        }
//        System.out.println("de la Rosa".compareTo("De La Rosa"));
//        char c = 'z' - 'a';
//        System.out.println(c);
//        System.out.println("h".compareTo("q"));
//        String [] words = {"hi", "hello", "goodbye"};
//        ArrayList<String> wordList = new ArrayList();
//        for(String s : words) {
//            System.out.print(s + " ");
//            wordList.add(s);
//        }
//        System.out.println();
//
//        Collections.sort(wordList);
//        for(String s : wordList) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
//
//        for(int i = 0; i < al.size(); i++) {
//            Book b = al.get(i);
//        }
    }
}

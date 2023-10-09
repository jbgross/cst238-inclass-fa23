package sec1.wk08_mon_1;

import java.util.*;

public class BookSortTester {
    public static void main(String[] args) {
        Book b1 = new Book("A Story", "Some Author", 192);
        System.out.println(b1);
        System.out.println(b1.equals(b1));
        Book b2 = new Book("A Story", "Some Author", 192);
        System.out.println(b2.equals(b1));
        ArrayList<Book> al = new ArrayList<>();
        al.add(b1);
        al.add(b2);
        al.add(new Book("Of Mice and Men", "John Steinbeck", 350));
        al.add(new Book("East of Eden", "John Steinbeck", 400));
        al.add(new Book("The Cat in the Hat", "Dr. Suess", 50));
        al.add(new Book("Green Eggs and Ham", "Dr. Suess", 50));
        System.out.println(al);
        Collections.sort(al);
        for(Book b : al) {
            System.out.print(b.getPageCount() + ", ");
        }
        System.out.println();

//        for(int i = 0; i < al.size(); i++) {
//            Book b = al.get(i);
//
//        }
//        System.out.println("de la Rosa".toUpperCase().compareTo("De La Rosa".toUpperCase()));
//        System.out.println("helloo".compareToIgnoreCase("he"));
//        char a = 'x' - 'q';
//        System.out.println(a);
//        System.out.println("foo".compareToIgnoreCase("FOO"));
    }
}

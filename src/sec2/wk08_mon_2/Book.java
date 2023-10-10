package sec2.wk08_mon_2;

public class Book implements Comparable<Book> {
    private int pageCount;
    private String genre;
    private final String title;
    private String author;

    public Book(String title, String author, String genre, int pageCount) {
        this.pageCount = pageCount;
        this.genre = genre;
        this.title = title;
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return this.title + " by " + this.author +
                " ("+ this.genre + ", " + this.pageCount + " pages)";
    }

    public boolean equals(Book b) {
//        b.title = "Dictionary";
        return this.title.equals(b.title)
                && this.author.equals(b.author)
                && this.pageCount == b.pageCount;
    }

    public int compareTo(Book b) {
//        return this.author.compareTo(b.author);
        return this.pageCount - b.pageCount;
    }
}

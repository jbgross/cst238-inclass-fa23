package sec1.wk08_mon_1;

public class Book implements Comparable<Book> {
    private int pageCount;
    private String title;
    private String author;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String toString() {
        return this.title + " by " + this.author
                + " (" + this.pageCount + " pages)";
    }

    public boolean equals(Book b) {
        return this.title.equals(b.title) && this.author.equals(b.author)
            && this.pageCount == b.pageCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int compareTo(Book b) {
//        b.title = "dictionary";
//        return this.author.compareTo(b.author);
        return this.pageCount - b.pageCount;
    }


}

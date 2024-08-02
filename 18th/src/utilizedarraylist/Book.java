import java.util.Comparator;

public class Book {
    private String title;
    private String author;
    private String publishedYear;

    Book(String title, String author, String publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public static Comparator<Book> titleComparator = Comparator.comparing(book -> book.title);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return title+" "+author+" "+publishedYear;
    }
}

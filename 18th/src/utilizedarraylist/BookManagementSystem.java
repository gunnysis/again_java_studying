import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class BookManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("java","gunny","2024"));
        books.add(new Book("c","park","2021"));
        books.add(new Book("dart","gunny","2022"));
        books.add(new Book("php","park","2023"));

        Collections.sort(books, Book.titleComparator);

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

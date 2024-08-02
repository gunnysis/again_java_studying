package etc;

import java.lang.reflect.Field;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int price;
    public Book(String title, String author, String publisher, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    void getFieldVariables() throws IllegalAccessException {
        Field[] variables = this.getClass().getDeclaredFields();

        for (Field field : variables) {
            field.setAccessible(true); // setting to access field things.
            System.out.println(field.getName()+": "+field.get(this));
        }
    }
}

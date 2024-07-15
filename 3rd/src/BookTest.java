public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("미움받을 용기",12000);
        System.out.println("Do calling all methods of Book class");
        System.out.println("static mS method of Book class:"+Book.mS());
        book2.mA();
        System.out.println("book2 instance of mB method:"+book2.mB());
        System.out.println("book2 instance of mC method:"+book2.mC());
        System.out.println("book2 instance of mD method:"+book2.mD());
    }
}

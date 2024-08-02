package etc;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("x 값 입력: ");
//        String strX = scanner.nextLine();
//        System.out.println("x: "+strX);
//
//        System.out.println("y 값 입력: ");
//        String strY = scanner.nextLine();
//        System.out.println("y: "+strY);
//
//        int result = Integer.valueOf(strX) + Integer.valueOf(strY);
//        System.out.println("x + y: "+result);

        System.out.print("input title: ");
        String title = scanner.nextLine();
        System.out.print("input author: ");
        String author = scanner.nextLine();
        System.out.print("input publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Book book = new Book(title,author,publisher,price);

        book.getFieldVariables();

        scanner.close();
    }
}

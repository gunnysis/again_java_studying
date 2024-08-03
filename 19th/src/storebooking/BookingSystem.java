package storebooking;

import java.sql.Date;

public class BookingSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe");
        Therapy therapy = new Therapy("Gunny Therapy");

        System.out.println(therapy.reserve(Date.valueOf("2024-08-02"),customer1,10000));
        System.out.println(therapy.reserve(Date.valueOf("2024-08-15"),customer1,30000));

        System.out.println(therapy.getBookedList());
        System.out.println(customer1.BookedInfo);
    }
}

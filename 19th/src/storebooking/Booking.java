package storebooking;

import java.util.Date;

public interface Booking {
    String reserve(Date date,Customer customer,int paidAmount);
}

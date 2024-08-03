package storebooking;

import java.util.Date;
import java.util.TreeMap;

public class Customer {
    String name;
    TreeMap<Date, String> BookedInfo = new TreeMap<>();

    Customer(String name) {
        this.name = name;
    }

    public boolean setBookedInfo(Date date, String serviceName) {
        if (!BookedInfo.containsKey(date)) {
            BookedInfo.put(date, serviceName);
            return true;
        } else {
            return false;
        }
    }
}

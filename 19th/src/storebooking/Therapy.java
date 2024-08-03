package storebooking;

import java.util.Date;
import java.util.TreeMap;

public class Therapy implements Booking{
    public String storeName;
    private TreeMap<Date, Customer> bookedList = new TreeMap<>();
    public TreeMap<Integer, String> serviceList = new TreeMap<>();

    Therapy(String storeName) {
        this.storeName = storeName;
        serviceList.put(10000, "hand");
        serviceList.put(30000, "face");
        serviceList.put(50000, "body");
    }

    public TreeMap<Integer, String> getServiceList() {
        return serviceList;
    }


    public boolean setServiceList(int amount, String serviceName) {
        if(!serviceList.containsValue(serviceName)) {
            serviceList.put(amount, serviceName);
            return true;
        } else {
            return false;
        }
    }

    public TreeMap<Date, Customer> getBookedList() {
        return bookedList;
    }

    @Override
    public String reserve(Date date, Customer customer, int paidAmount) {
        if(bookedList.containsKey(date)){
            return "Please make a reservation for another date because your requested date is already booked";
        } else {
            bookedList.put(date,customer);
            customer.setBookedInfo(date,serviceList.get(paidAmount));
            return "Successfully reserved the date: "+date.toString();
        }
    }
}

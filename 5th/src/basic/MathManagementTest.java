package basic;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.stream.IntStream;

public class MathManagementTest {
    public static void main(String[] args) {
        boolean checkProperFraction =  MathManagement.isProperFraction(8,4);
        System.out.println("===================================");
        System.out.println("1. is ProperFraction? "+checkProperFraction);
        System.out.println("===================================");
        System.out.println("2. what is days of 6 month? "+MathManagement.getDaysOfMonth(6));
        System.out.println("===================================");
        System.out.println("3. PrimeNumber of From 1 to 100");
        System.out.println("-----------------------------------");
        MathManagement mathManagement = new MathManagement();
        int[] nums = IntStream.rangeClosed(1, 100).toArray();
        mathManagement.isPrimeNumber(nums);


    }
}

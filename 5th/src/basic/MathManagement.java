package basic;

import java.math.BigInteger;
import java.time.YearMonth;

public class MathManagement {
    // numerator, denominator, proper fraction
    static boolean isProperFraction(int numerator, int denominator) {
        return numerator < denominator ? true : false;
    }

    static int getDaysOfMonth(int month) {
        return YearMonth.of(2024, month).lengthOfMonth();
    }

    void isPrimeNumber(int[] nums) {
        for (int num : nums) {
            System.out.println(num+" is "+BigInteger.valueOf(num).isProbablePrime(10));
        }
    }
}

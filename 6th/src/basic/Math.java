package basic;

import java.util.stream.IntStream;

public class Math {
    
    int sum(int toNum) {
        int result = 0;
        for (int i = 0; i < toNum; i++) {
            result = result + i;
        }
        return result;
    }

    int sumOddNumber(int toNum) {
        return IntStream.rangeClosed(1,toNum).filter(n -> n % 2 == 0).sum();
    }
}

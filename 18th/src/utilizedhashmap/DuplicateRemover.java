package utilizedhashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateRemover {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3,5,7,3,2,5,9,10,2,1,7,8,4,5,9,22,23);
        HashSet<Integer> hashSet = new HashSet<>(inputList);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(inputList);

        System.out.println("Out-of-order deduplicated int values: "+linkedHashSet);
        System.out.println("Ordered deduplicated int values: "+linkedHashSet);
    }
}

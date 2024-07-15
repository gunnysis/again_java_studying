import java.util.stream.IntStream;

public class ExArray {
    public static void main(String[] args) {
        //int[] array = new int[];
        //array = [10,20,30];
        //int[] array = {10,20,30};

        // using for statement
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        // using stream class
//        IntStream.range(0,array.length).forEach(i -> System.out.println(array[i]));
//      // using hash map
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,10);
//        map.put(1,20);
//        map.put(2,30);
//
//        IntStream.range(0, map.size()).forEach(i -> System.out.println(map.get(i)));
//
        // sum to all Array values using IntStream class
        //int sum = IntStream.of(array).sum();
        // System.out.println(IntStream.range(0,array.length).map(i -> array[i]).sum());
        //System.out.println(sum);

        //String[] fruits = {"banana","apple","mango"};
        int[] intArray = IntStream.rangeClosed(1,10).toArray();
//        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        // for-each statement
//        for(String fruit : fruits) {
//            System.out.println(fruit);
//        }
        for(int intValue : intArray) {
            System.out.println(intValue);
        }



    }
}

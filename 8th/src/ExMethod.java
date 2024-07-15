import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExMethod {

    void a(byte b, short s, int i, long l) {
        System.out.println("byte: " + b + ", short: " + s + ", int: " + i + ", long: " + l);
    }

    void b(float f, double d) {

        System.out.println("float: " + f + ", double: " + d);
    }

    void c(char[] cArray, String[] sArray) {
        System.out.println("Values of cArray");
        // Error code is 'Stream.of(cArray).forEach(c -> System.out.print(c+","));'
        // Stream.of method creates a stream of an array,
        // and considers arrays of basic types (char[], int[], float[], etc.) as objects when creating a stream.
        // Therefore, Stream.of(cArray) creates a stream by considering the entire char array as a single element.
        // ----------------------
        // If you want to process a primitive type array (char[]) as a stream, you should use IntStream.
        IntStream.range(0,cArray.length).forEach(c -> System.out.print(cArray[c]+","));
        System.out.println();
        System.out.println("=================");
        System.out.println("Values of sArray");
        Stream.of(sArray).forEach(s -> System.out.print(s+","));
    }
}

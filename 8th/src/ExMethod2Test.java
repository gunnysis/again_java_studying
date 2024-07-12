import java.util.stream.IntStream;

public class ExMethod2Test {
    public static void main(String[] args) {
        ExMethod2 exMethod2 = new ExMethod2();
        System.out.println("Call a method: "+exMethod2.a(5,7));
        System.out.println("Call b method: "+exMethod2.b(5));
        System.out.println("Call c method: "+exMethod2.c(1));
        System.out.println("Call d method: "+exMethod2.d('c','e'));
        System.out.print("Call e method: ");
        IntStream.of(exMethod2.e(30,20)).forEach(i -> System.out.print(i+","));
        System.out.println();
        IntStream.range(0,exMethod2.f("My","Name").length)
                .forEach(i -> System.out.print(exMethod2.f("My","Name")[i]+","));

    }
}

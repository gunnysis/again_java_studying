public class ExMethodTest {
    public static void main(String[] args) {
        ExMethod exMethod = new ExMethod();

        System.out.println("Call a method");
        // default type of integer is int
        // int -> byte or short => type casting
        exMethod.a((byte) 1, (short) 2,3,4);
        System.out.println("Call b method");
        // default type of real number is double
        // double -> float => type casting
        exMethod.b((float) 10.0,20.5);
        System.out.println("Call c method");
        exMethod.c(new char[]{'a','b','c'},new String[]{"abc","defzhf","1234"});
    }
}

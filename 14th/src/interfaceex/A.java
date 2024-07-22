package interfaceex;

public interface A {
    double PI = 3.14;

    void methodA();

    static void methodB() {
        System.out.println("static methodB");
    }

    default void methodC() {
        System.out.println("default methodC");
    }
}

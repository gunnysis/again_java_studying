package interfaceex;

public class MainTest {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodC();

        Dog dog = new Dog();
        System.out.println("Define dog instance of Dog class");

        // same dog's instance is call methods of same class
        dog.sleep();
        dog.love();

        System.out.println("Use way of new Dog");

        // each instance is call methods of same class
        (new Dog()).sleep();
        (new Dog()).love();



    }
}

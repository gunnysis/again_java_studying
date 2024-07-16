package staticex;

public class Person {
    String name;
    static int population;

    public Person(String name) {
        this.name = name;
        population++;
    }

    static void mA() {
        System.out.println("호출됨");
    }

    static {
        population = 100;
    }
}

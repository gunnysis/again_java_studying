package staticex;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        System.out.println(Person.population);

        Person p2 = new Person("B");
        System.out.println(Person.population);

        Person p3 = new Person("C");
        System.out.println(Person.population);

        Person.mA();

        // Even if you control a static variable through an instance, you are all controlling the same variable.
        p2.population = 50;
        System.out.println("p2.population: "+p2.population);
        System.out.println("Person.population: "+Person.population);


    }
}

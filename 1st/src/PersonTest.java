public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.m();

        System.out.println(p1.age);

        Person p2 = new Person("B",10);
        p2.m();

        System.out.println(p2.age);
    }
}

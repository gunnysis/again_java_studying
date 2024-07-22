package abstractanimals;

public class MainTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        dog.eat();
        dog.bear();
        dog.sleep();

        Mammal mammal = new Dog("Mammal");
        mammal.eat();
        mammal.bear();
        mammal.sleep();

        Animal animal = new Dog("Animal");
        animal.eat();
        animal.sleep();
        animal.eat();


    }
}

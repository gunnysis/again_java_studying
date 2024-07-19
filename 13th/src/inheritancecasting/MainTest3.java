package inheritancecasting;

public class MainTest3 {
    public static void main(String[] args) {
        A a = new A();
        // Argument is Upcasted value
        //a.mA(new Cat());

        // Object variable of Class Araay Type
        // It's values that can be only Class values of inheritance Relationship
        Animal[] animals = {new Animal(), new Cat(), new Dog()};
        animals[0].play();
        animals[1].play();
        animals[2].play();
    }
}

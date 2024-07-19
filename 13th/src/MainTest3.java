public class MainTest3 {
    public static void main(String[] args) {
        A a = new A();
        // Argument is Upcasted value
        //a.mA(new Cat());

        // Object variable of Class Araay Type
        // It's values that can be only Class values of inheritance Relationship.
        Animal[] animals = {new Animal(), new Cat(), new Dog()};

        // Array Class Type variable's all values call play method.
        for (Animal a1 : animals) {
            a1.play();
        }
    }
}

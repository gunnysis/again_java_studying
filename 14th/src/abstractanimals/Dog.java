package abstractanimals;

public class Dog extends Mammal {
    String instanceName;

    Dog(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    void bear() {
        System.out.println(instanceName+" bears");
    }

    @Override
    void eat() {
        System.out.println(instanceName+" eats");
    }

    @Override
    void sleep() {
        System.out.println(instanceName+" sleeps");
    }
}

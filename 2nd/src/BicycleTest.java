public class BicycleTest {
    public static void main(String[] args) {
        Bicycle bicycle1
                = new Bicycle(10, 20);
        Bicycle bicycle2
                = new Bicycle(15, 25);


        System.out.println("speed: " + bicycle1.getSpeed());
        bicycle1.applyBrake(2);
        bicycle1.speedUp(15);
        System.out.println("speed(after speed up): " + bicycle1.getSpeed());



    }
}

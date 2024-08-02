package generic;

public class Bag {
    public <T extends Item> void put(T t) {
        System.out.println(t + " is put to bag");
    }
}

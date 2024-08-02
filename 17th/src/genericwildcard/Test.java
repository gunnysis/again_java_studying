package genericwildcard;

public class Test {
    public static void main(String[] args) {
        Service.deliver(new Store<HeavyItem>());
        Service.deliver(new Store<TV>());

        Service.pack(new Store<LightItem>());
        Service.pack(new Store<Item>());
    }
}

package genericwildcard;

public class Service {
    static void deliver(Store<? extends HeavyItem> store) {
        System.out.println("배달을 신속히 한다.");
    }

    static void pack(Store<? super LightItem> store) {
        System.out.println("포장을 예쁘게 한다.");
    }
}

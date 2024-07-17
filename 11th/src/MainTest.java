public class MainTest {
    public static void main(String[] args) {
        Child c3 = new Child();

        System.out.println(c3.work(8));

        Child.meetFriend("부모찬구");
        Parent.meetFriend("내찬구");
    }
}

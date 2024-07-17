// Inheritance class concept
public class Child extends Parent{
    Child() {
        super(500000);
        System.out.println("Child() 호출");
    }

    int work(int time) {
        return time * 100;
    }

    void save(int money) {
    }

    // Method Hiding concept
    static void meetFriend(String name) {
        System.out.println("자식 놀다");
    }
}
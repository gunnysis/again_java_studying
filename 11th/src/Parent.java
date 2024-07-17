public class Parent {
    Parent() {
        System.out.println("Parent() 호출");
    }

    Parent(int amount) {
        System.out.println("Parent(int amount)");
    }

    // Method Hiding concept
    static void meetFriend(String name) {
        System.out.println("부모 놀다");
    }
}

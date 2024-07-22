public class MainTest {
    public static void main(String[] args) {
        X x = new X();
        x.a = new B();
        x.a.mA();
        x.mX(new B());
        x.a.mA();
        x.mX(new C());
        x.a.mA();
    }
}

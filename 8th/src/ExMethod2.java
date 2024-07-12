public class ExMethod2 {
    int a(int a, int b) {
        return a+b;
    }

    double b(double d) {
        return Math.pow(d,2);
    }

    boolean c(int i) {
        return i % 2 == 1;
    }

    String d(char c1, char c2) {
        return c1 + String.valueOf(c2);
    }

    int[] e(int a, int b) {
        return new int[]{a,b};
    }

    String[] f(String s1, String s2) {
        return new String[]{s1,s2};
    }

}

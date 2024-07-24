package etc;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("person");

        // Exceptions
        try {
            int i = 1/0;
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
            int[] array = new int[10];
            System.out.println(array[10]);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
        // -> combine Exception's try catch
        try {
            int i = 1/0;

            int[] array = new int[10];
            System.out.println(array[10]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("에러");
        }
    }
}

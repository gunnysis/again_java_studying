package inheritancecasting;

public class TypeCasting {
    public static void main(String[] args) {

        Dog dog = new Dog();
        // It can be casting of Class Type on only classes of inheritance relationship.
        Animal animal = dog;
        Animal a = new Cat(); // Up Casting
        a = (Cat)a; // Down Casting
        // Occur ClassCastException
        // Dog dog = (Dog) animal;

//--------------------------------------------------
//        int a = 100;
//        // auto casting
//        double b = a;
//        System.out.println("(double)a value:"+b);
//
//        short x = 200;
//        // forced casting
//        byte y = (byte)x;
//        System.out.println("(byte)x value:"+y);
//
//        short s = 100;
//
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//
//        if ((s>=Byte.MIN_VALUE) && (s<=Byte.MAX_VALUE)) {
//            System.out.println(s);
//        }
    }
}

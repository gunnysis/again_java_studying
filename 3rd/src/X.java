public class X {
    public X() {

    }

    public static void main(String[] args) {
        String string1 = new String();
        String string2 = new String("   abc   def   ");
        System.out.println(string2);
        System.out.println(string2.charAt(0));
        System.out.println(string2.concat("_TEST"));
        System.out.println("string2 value equal with abcdef: " + string2.contentEquals("abcdef"));
        System.out.println("string1 value is Empty? " + string1.isEmpty());
        System.out.println("result of string2 using trim method: |" + string2.trim()+"|");
        System.out.println("calling static variable of A class: "+A.i);
        System.out.print("calling static method of A class: ");
        A.m();
    }
}

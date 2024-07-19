package upcastingexam;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {

        ClassA a = new ClassD();
        ClassC c = new ClassF();
        ClassF f = new ClassG();

        // Call the methods available on the object of ClassA type.
        System.out.println("Methods available in ClassA type (a):");
        invokeMethods(a, ClassA.class);

        // Call the methods available on the object of ClassC type.
        System.out.println("\nMethods available in ClassC type (c):");
        invokeMethods(c, ClassC.class);

        // Call the methods available on the object of ClassF type.
        System.out.println("\nMethods available in ClassF type (f):");
        invokeMethods(f, ClassF.class);

    }


    // Its method is to call the methods available
    // on the first parameter's object variable at the second parameter's class type variable.
    // '?' (Generic)can use be that is all available Class Type.
    public static void invokeMethods(Object obj, Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            try {
                // if ( method.equals(obj.getClass().getMethods()) != true ) {
                if (method.getDeclaringClass() != Object.class) {
                    method.setAccessible(true);
                    method.invoke(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




}

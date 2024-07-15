public class Test {
    public static void main(String[] args) {

        // Using values on parameter variables
        // Rectangle rectangle = new Rectangle(10,10);
        // Using object variable on parameter variable
        // Point p1 = new Point(5, 10);
        // 1.
        // Rectangle rectangle = new Rectangle(p1);
        // 2.
        // Rectangle rectangle = new Rectangle(new Point(5, 10));

        // Using record variable on parameter variable
        Rectangle rectangle = new Rectangle(new PointRecord(10, 15));

        System.out.println("Area: "+rectangle.getArea());
        // Call Point field variable's value using Rectangle object variable
        System.out.println("x:"+rectangle.point.x+", y:"+rectangle.point.y);

        Rectangle r5 = new Rectangle(new Point(1,2),5,10);
        r5.move(30,70);
    }
}

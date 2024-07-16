public class ArrayTest {
    public static void main(String[] args) {
        // Object array type
        Point[] points = new Point[3];
        points[0] = new Point(32, 64);
        points[1] = new Point(16, 79);
        points[2] = new Point(82, 52);

        // -> Occur NullPointException
        //points = null;
        //System.out.println(point[0].x);

        Rectangle[] recs = new Rectangle[4];

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(points[2]);
        Rectangle r3 = new Rectangle(50, 100);
        Rectangle r4 = new Rectangle(points[0], 100, 200);

        recs[0] = r1;
        recs[1] = r2;
        recs[2] = r3;
        recs[3] = r4;
    }

}

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        //It can skip super method at default constructor, because java compiler automatically creates super method at default constructor.
        //Call constructor of parent class
        //super();
        this.x = x;
        this.y = y;
    }
}

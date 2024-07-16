public class Rectangle {
    int width;
    int height;
    Point point;

    Rectangle() {
        point = new Point(0,0);
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point point) {
        this.point = point;
        this.width = point.x;
        this.height = point.y;
    }

    public Rectangle(Point point, int x, int y) {
        this.point = point;
        this.width = x;
        this.height = y;
    }

    int getArea() {
        return width * height;
    }

    void move(int x, int y) {
        point.x = x;
        point.y = x;
    }
}

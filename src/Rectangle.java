/*
    Job of Rectangle:
        - To perform all operations related to length and breadth
                e.g. calculate area and perimeter
 */
public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

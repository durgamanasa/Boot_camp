/*
    Job of Rectangle:
        - To calculate area
        - To calculate perimeter
 */
public class Rectangle {
    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static Rectangle create(int length, int breadth) throws InvalidDimensionException {
        if (length < 0 || breadth < 0)
            throw new InvalidDimensionException();
        return new Rectangle(length, breadth);
    }
}

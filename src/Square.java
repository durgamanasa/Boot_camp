public class Square {
    private static double side;

    private Square(double side) {

        this.side = side;
    }

    public static Square create(double side) throws InvalidDimensionException {
        if (side<0)
            throw new InvalidDimensionException();
        return new Square(side);
    }

    public double calculateArea() {
        return Math.pow(side,2);
    }

    public double calculatePerimeter() {
        return 4*side;
    }
}

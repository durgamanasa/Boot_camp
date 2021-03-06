/*
To provide what user wants
 */
public class Square extends Rectangle {

    private Square(double side) {
        super(side,side);
    }

    public static Square create(double side) throws InvalidDimensionException {
        if (side<0)
            throw new InvalidDimensionException();
        return new Square(side);
    }
}

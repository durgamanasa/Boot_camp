public class InvalidMeasurementEqualityException extends Throwable{
    public InvalidMeasurementEqualityException() {
        super("You can't compare two different types of measurements");
    }
}

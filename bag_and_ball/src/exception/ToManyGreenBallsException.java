package exception;

public class ToManyGreenBallsException extends Throwable {
    public ToManyGreenBallsException() {
        super("You can't add more than three green balls");
    }
}

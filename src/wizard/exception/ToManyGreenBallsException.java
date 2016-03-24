package wizard.exception;

public class ToManyGreenBallsException extends Throwable{
    public ToManyGreenBallsException() {
        super("You can't store more than three green balls");
    }
}

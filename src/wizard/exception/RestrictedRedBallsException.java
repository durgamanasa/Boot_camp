package wizard.exception;

public class RestrictedRedBallsException extends Throwable {
    public RestrictedRedBallsException() {
        super("Bag can't store red balls if there is green ball in the bag");
    }
}

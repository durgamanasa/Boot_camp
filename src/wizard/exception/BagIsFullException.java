package wizard.exception;

public class BagIsFullException extends Throwable {
    public BagIsFullException() {
        super("You can not store more than 12 balls in the Bag");
    }
}

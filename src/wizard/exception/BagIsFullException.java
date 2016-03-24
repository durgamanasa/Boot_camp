package wizard.exception;

public class BagIsFullException extends Throwable {
    public BagIsFullException() {
        super("Bag is full,you can not store more than 12 balls in the Bag");
    }
}

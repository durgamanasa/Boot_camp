package exception;

public class BagFullException extends Throwable {
    public BagFullException(int capacityOfBag) {
        super("Bag is full you can not store more than " + capacityOfBag + " balls");
    }
}

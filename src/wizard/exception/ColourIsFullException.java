package wizard.exception;

public class ColourIsFullException extends Throwable{
    public ColourIsFullException() {
        super("More of this colour is not allowed");
    }
}

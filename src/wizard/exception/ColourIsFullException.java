package wizard.exception;

public class ColourIsFullException extends Throwable{
    public ColourIsFullException() {
        super("You can't store more than three green balls");
    }
}

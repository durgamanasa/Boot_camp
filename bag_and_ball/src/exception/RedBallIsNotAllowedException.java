package exception;

public class RedBallIsNotAllowedException extends Throwable {

    public RedBallIsNotAllowedException() {
        super("You can't add red ball with out adding at least one green ball");
    }
}

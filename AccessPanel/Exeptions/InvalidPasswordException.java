package AccessPanel.Exeptions;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String s) {
        super(s);
    }
}

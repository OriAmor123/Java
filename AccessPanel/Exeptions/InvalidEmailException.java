package AccessPanel.Exeptions;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String s) {
        super(s);
    }
}

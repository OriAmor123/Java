package AccessPanel.Exeptions;

public class InvalidPasswordExeption extends RuntimeException {
    public InvalidPasswordExeption(String s) {
        super(s);
    }
}

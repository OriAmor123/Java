package AccessPanel.Exeptions;

public class InvalidEmailExeption extends RuntimeException {
    public InvalidEmailExeption(String s) {
        super(s);
    }
}

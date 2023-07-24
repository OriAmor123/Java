package AccessPanel;

public class Main {
    public static void main(String[] args) {
        PasswordList userList = new PasswordList();
        new AccessPanel(userList.getHashMap());
    }
}

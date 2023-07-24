package AccessPanel;

import java.util.HashMap;

public class PasswordList {
    private HashMap<String, String> userList = new HashMap<String, String>();
    
    PasswordList() {
        userList.put("Ori", "12345");
        userList.put("Yahel", "98765");
    }
    
    protected HashMap<String, String> getHashMap() {
        return userList;
    }
}

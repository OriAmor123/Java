package AccessPanel;

import java.util.HashMap;
import java.util.Set;

public class UserList {

    private static HashMap<String ,User> list = new HashMap<>();
    private static Set<String> userNames = list.keySet();

    private UserList() {
        
    }
    public static HashMap<String, User> getList() {
        return list;
    }

    public static void addUser(User user) {
        userValidator(user);
        list.put(user.getUsername(), user);
    }

    public static void editUser(User oldUser ,User newUser) {
        userValidator(newUser);
        list.remove(oldUser.getUsername());
        list.put(newUser.getUsername(),newUser);
    }

    public static void removeUser(User user) {
        list.remove(user.getUsername());
    }

    public static Set<String> getUserNames() {
        return userNames;
    }

    private static void userValidator(User user) {
        if (user == null) {
            throw new RuntimeException("User is null");
        }
    }
}

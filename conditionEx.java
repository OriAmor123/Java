public class conditionEx {
    public static boolean emailValidator(String email) {
        if (email.length() == 0) {
            return false;
        }
        char atSign = '@';
        char period = '.';
        int atIndex = -1, periodIndex = -1;
        boolean valid = true;
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == atSign) {
                if (atIndex == -1) {
                    atIndex = i;
                } else {
                    valid = false; // @ appears twice or more
                }
            }
            if (ch == period && atIndex != -1) {
                if (i - 1 == periodIndex) { // if there are two periods adjacent
                    valid = false;
                } else if (i - 1 == atIndex) { // if there is a period after an at sign
                    valid = false;
                } else if (i == email.length() - 1) {
                    valid = false;
                } else {
                    periodIndex = i;
                }
            }
        }
        if (atIndex == -1 || periodIndex == -1) {
            valid = false;
        }
        return valid;
    }

    public static void main(String[] args) {
        // System.out.println(emailValidator("@.ab"));
        // System.out.println(emailValidator("@a.b"));
        // System.out.println(emailValidator("@a.b.c"));
        // System.out.println(emailValidator("@a..b"));
        // System.out.println(emailValidator("@ab."));
        // System.out.println(emailValidator("@ab"));
        System.out.println(String.format("{Username: %s, Password: %s, Email: %s, Birth Date: %s}", "usernameee",
                "passi", "abc@gmail.gl", "24/4/5"));
    }
}

package AccessPanel.UserHandling;

import AccessPanel.Exeptions.*;

public class User {
    private String userName;
    private String password;
    private String email;
    private String birthDate;

    public User(String userName, String password, String email, String birthDate) {
        if (passValidator(password)) {
            this.password = password;
        } else {
            throw new InvalidPasswordException("Password is invalid");
        }
        /*
         * maybe i will move the validator function to the register window
         * and the assignment of the password would be this.password = password;
         * duo to the password will be valid for sure, otherwise the user won't be created.
         * Try using try/catch block, try to create a user, if got runtime exeption display a label with the error
         */
        if (emailValidator(email)) {
            this.email = email;
        } else {
            throw new InvalidEmailException("Email is invalid");
        }
        this.userName = userName;
        this.birthDate = birthDate;
    }

    private boolean emailValidator(String email) {
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
                } else if (i == email.length() - 1) { // if the period is the last char
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

    private boolean passValidator(String pass) {
        if (pass.length() < 8) {
            return false;
        }
        boolean valid = true;
        if (!Character.isUpperCase(pass.charAt(0))) {
            valid = false;
        }
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (!(Character.isLetter(ch) || Character.isDigit(ch))) {
                valid = false;
            }
        }
        return valid;
    }

    // * Getters
    public String getUsername() {
        return this.userName;
    }
    public String getPassword() {
        return this.password;
    }
    public String getEmail() {
        return this.email;
    }
    public String getBirthDate() {
        return this.birthDate;
    }

    // * Setters
    public void setUsername(String altUsername) {
        this.userName = altUsername;
    }
    public void setPassword(String altPass) {
        if (passValidator(altPass)) {
            this.password = altPass;
        }
        throw new RuntimeException("Password is invalid");
    }
    public void setEmail(String altEmail) {
        if (emailValidator(altEmail)) {
            this.email = altEmail;
        }
        throw new RuntimeException("Email is invalid");
    }
    public void setBirthDate(String altBirthDate) {
        this.birthDate = altBirthDate;
    }
    
    // * toString() overriding
    public String toString() {
        String details = String.format("{Username: %s, Password: %s, Email: %s, Birth Date: %s}", this.userName, this.password, this.email,this.birthDate);
        return details;
    }

    // * equals(Object obj) overriding
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User objUser = (User) obj;
            if (
                this.userName == objUser.userName &&
                this.password == objUser.password &&
                this.email == objUser.email &&
                this.birthDate == objUser.birthDate) {
                return true;
            }
        }
        return false;
    }

}
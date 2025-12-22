package chapter08_0bject_oriented_programming.encapsulation.problem03_UserPasswordSecurity;

public class UserAccount {

    private String username;
    private String password;

    UserAccount(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public void setPassword(String password) {
        boolean hasdigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasdigit = true;
                break;
            }
        }
        if (!hasdigit) {
            System.out.println("Password must have atleast one digit");
        }
        if (password.length() >= 8 && hasdigit) {
            this.password = password;
        }
    }

    public String getUsername() {
        return this.username;
    }
}

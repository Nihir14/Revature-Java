package projects.security;

public class UserAccount {

    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    private boolean isValidPassword(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*\\d.*");
    }

    public void setPassword(String pwd) {
        if (isValidPassword(pwd)) {
            this.password = pwd;
        } else {
            System.out.println("Invalid password format.");
        }
    }

    public boolean login(String pwd) {
        return password.equals(pwd);
    }

    public String getUsername() {
        return username;
    }
}

package testing;

public class AuthService {

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return username.equals("admin") && password.equals("admin123");
    }
}

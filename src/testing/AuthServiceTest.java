package testing;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {

    @Test
    public void loginSuccessTest() {

        // ARRANGE
        AuthService authService = new AuthService();
        String username = "admin";
        String password = "admin123";

        // ACT
        boolean result = authService.login(username, password);

        // ASSERT
        assertTrue(result);
    }
}

package testing.stub.stubtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NotificationManagerTest {

    @Test
    void testNotificationSent_WithStub() {

        // ARRANGE
        EmailService stub = new EmailServiceStub();
        NotificationManager manager = new NotificationManager(stub);

        // ACT
        String result = manager.notifyUser("test@example.com");

        // ASSERT
        assertEquals("NOTIFICATION SENT", result);
    }
}

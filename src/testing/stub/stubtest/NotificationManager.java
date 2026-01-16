package testing.stub.stubtest;

public class NotificationManager {

    private EmailService emailService;

    public NotificationManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public String notifyUser(String userEmail) {
        boolean sent = emailService.sendEmail(userEmail, "Welcome!");
        return sent ? "NOTIFICATION SENT" : "NOTIFICATION FAILED";
    }
}

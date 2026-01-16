package testing.stub.stubtest;

public class RealEmailService implements EmailService {

    @Override
    public boolean sendEmail(String to, String message) {
        // real SMTP/email server call
        return false;
    }
}

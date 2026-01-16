package testing.stub.stubtest;

public class EmailServiceStub implements EmailService {

    @Override
    public boolean sendEmail(String to, String message) {
        // predefined response for testing
        return true;
    }
}

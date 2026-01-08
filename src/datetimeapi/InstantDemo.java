package datetimeapi;

import java.time.Instant;

public class InstantDemo {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println("Current Instant: " + now);

        // Epoch seconds
        System.out.println("Epoch Seconds: " + now.getEpochSecond());
    }
}

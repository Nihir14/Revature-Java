package datetimeapi;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDifferenceDemo {

    public static void main(String[] args) {

        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.now();

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Hours   : " + duration.toHours());
        System.out.println("Minutes : " + duration.toMinutes());
        System.out.println("Seconds : " + duration.getSeconds());
    }
}

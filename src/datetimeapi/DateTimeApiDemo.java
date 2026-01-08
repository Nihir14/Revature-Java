package datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.Duration;

public class DateTimeApiDemo {

    public static void main(String[] args) {

        // ---------------- LocalDate ----------------
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        LocalDate customDate = LocalDate.of(2024, 5, 10);
        System.out.println("Custom Date: " + customDate);


        // ---------------- LocalTime ----------------
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalTime customTime = LocalTime.of(10, 30, 45);
        System.out.println("Custom Time: " + customTime);


        // ---------------- LocalDateTime ----------------
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Current Date & Time: " + dateTimeNow);


        // ---------------- Formatting Date & Time ----------------
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = dateTimeNow.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);


        // ---------------- Period (Date Difference) ----------------
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 1);

        Period period = Period.between(startDate, endDate);
        System.out.println("Period Difference: "
                + period.getYears() + " year(s) "
                + period.getMonths() + " month(s) "
                + period.getDays() + " day(s)");


        // ---------------- Duration (Time Difference) ----------------
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(12, 30);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration Difference: "
                + duration.toHours() + " hours");
    }
}

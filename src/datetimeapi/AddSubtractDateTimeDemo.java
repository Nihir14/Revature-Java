package datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class AddSubtractDateTimeDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(10);
        LocalDate pastDate = today.minusMonths(2);

        System.out.println("Today       : " + today);
        System.out.println("After 10 Days: " + futureDate);
        System.out.println("Before 2 Months: " + pastDate);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time.plusHours(3));
    }
}

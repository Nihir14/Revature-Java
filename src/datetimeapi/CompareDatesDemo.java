package datetimeapi;

import java.time.LocalDate;

public class CompareDatesDemo {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2025, 1, 1);
        LocalDate date2 = LocalDate.now();

        System.out.println("Is date1 before date2? " + date1.isBefore(date2));
        System.out.println("Is date1 after date2? " + date1.isAfter(date2));
        System.out.println("Are both equal? " + date1.isEqual(date2));
    }
}

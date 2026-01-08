package datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingDemo {

    public static void main(String[] args) {

        String dateStr = "08-01-2026";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(dateStr, formatter);

        System.out.println("Parsed Date: " + date);
    }
}

package datetimeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceDemo {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);

        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }
}

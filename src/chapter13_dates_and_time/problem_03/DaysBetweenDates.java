package chapter13_dates_and_time.problem_03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2025, 12, 30);
        LocalDate date2 = LocalDate.of(2026, 1, 7);

        long days = ChronoUnit.DAYS.between(date1, date2);

        System.out.println(days);


    }
}

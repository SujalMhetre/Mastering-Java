package chapter13_dates_and_time.problem_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = date.format(dateFormatter);

        System.out.println(formattedDate);
    }
}

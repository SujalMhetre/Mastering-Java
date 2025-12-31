package chapter13_dates_and_time.problem_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddDates {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        LocalDate newDate = date.plusDays(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String newDateformat = newDate.format(formatter);

        System.out.println(newDateformat);


    }
}

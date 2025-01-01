package javaconcepts;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        // Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current Time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Formatting DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parsing DateTime
        String dateTimeString = "01-01-2024 12:30:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);

        // Date Arithmetic
        LocalDate tomorrow = currentDate.plusDays(1);
        System.out.println("Tomorrow's Date: " + tomorrow);

        LocalDate lastWeek = currentDate.minusWeeks(1);
        System.out.println("Last Week's Date: " + lastWeek);

        // Time Arithmetic
        LocalTime oneHourLater = currentTime.plusHours(1);
        System.out.println("One Hour Later: " + oneHourLater);

        LocalTime tenMinutesAgo = currentTime.minusMinutes(10);
        System.out.println("Ten Minutes Ago: " + tenMinutesAgo);
    }
}

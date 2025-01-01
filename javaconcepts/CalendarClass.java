package javaconcepts;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClass {
    public static void main(String[] args) {
        // Get an instance of Calendar
        Calendar calendar = Calendar.getInstance();

        // Display current date and time
        System.out.println("Current Date and Time:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Months are 0-based
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));

        // Setting a specific date
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JULY); // July is 6 (0-based index)
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println("\nSet Date: " + calendar.getTime());

        // Adding/Subtracting time
        calendar.add(Calendar.DAY_OF_MONTH, 10); // Add 10 days
        System.out.println("\nDate After 10 Days: " + calendar.getTime());

        calendar.add(Calendar.MONTH, -2); // Subtract 2 months
        System.out.println("Date 2 Months Ago: " + calendar.getTime());

        // Using GregorianCalendar (a subclass of Calendar)
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2022, Calendar.DECEMBER, 25);
        System.out.println("\nCustom Date using GregorianCalendar: " + gregorianCalendar.getTime());

        // Check if a year is a leap year
        int year = 2024;
        if (gregorianCalendar.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

package javaconcepts;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        // Current date and time
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Get time in milliseconds since epoch
        long currentTimeMillis = currentDate.getTime();
        System.out.println("Milliseconds since January 1, 1970: " + currentTimeMillis);

        // Creating a specific date (deprecated but included for legacy usage)
        Date specificDate = new Date(121, 11, 25); // Year offset from 1900, 0-based month
        System.out.println("Specific Date: " + specificDate);

        // Comparing dates
        Date anotherDate = new Date(121, 11, 24); // December 24, 2021
        if (specificDate.after(anotherDate)) {
            System.out.println("Specific Date is after Another Date.");
        } else {
            System.out.println("Specific Date is not after Another Date.");
        }

        if (specificDate.before(anotherDate)) {
            System.out.println("Specific Date is before Another Date.");
        } else {
            System.out.println("Specific Date is not before Another Date.");
        }

        // Converting Date to String
        String dateString = currentDate.toString();
        System.out.println("Date as String: " + dateString);
    }
}

package javaconcepts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ps15 {
    public static void main(String[] args) {
        // PS Q1 - Create an ArrayList and store the names of ten students inside it. Print it using a for each loop.
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o: ar){
            System.out.println(o);
        }

        // PS Q2 - Use the Date class in Java to print the time in the following format : 21:47:02.
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // PS Q3 - Repeat question number 2 using the Calendar class.
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));


        // PS Q5 - Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);
    }
}

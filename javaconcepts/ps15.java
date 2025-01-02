package javaconcepts;

import java.util.ArrayList;

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
    }
}

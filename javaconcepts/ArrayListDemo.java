package javaconcepts;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // Accessing an element
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // Modifying an element
        fruits.set(1, "Blueberry");
        System.out.println("After Modification: " + fruits);

        // Removing an element
        fruits.remove("Cherry");
        System.out.println("After Removal: " + fruits);

        // Checking the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the List: " + size);

        // Iterating over the ArrayList
        System.out.println("Iterating through the List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("After Clearing: " + fruits);
    }
}

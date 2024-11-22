package ass;

import java.util.ArrayList;
import java.util.Iterator;

public class Ab4_IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Create an Iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // Iterate through the ArrayList using the Iterator
        System.out.println("Iterating through the ArrayList:");
        while (iterator.hasNext()) {
            String fruit = iterator.next(); // Get the next element
            System.out.println(fruit); // Print the element
        }
    }
}

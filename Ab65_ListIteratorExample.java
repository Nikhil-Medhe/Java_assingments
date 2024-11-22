package ass;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ab65_ListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Create a ListIterator for the ArrayList
        ListIterator<String> listIterator = fruits.listIterator();

        // Forward iteration
        System.out.println("Iterating forward through the ArrayList:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next(); // Get the next element
            System.out.println(fruit); // Print the element
        }

        // Backward iteration
        System.out.println("\nIterating backward through the ArrayList:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous(); // Get the previous element
            System.out.println(fruit); // Print the element
        }

        // Example of modifying the list during iteration
        System.out.println("\nModifying the list:");
        listIterator = fruits.listIterator(); // Reset the iterator to the beginning
        while (listIterator.hasNext()) {
            String fruit = listIterator.next(); // Get the next element
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry"); // Replace "Banana" with "Blueberry"
            }
        }

        // Print the modified list
        System.out.println("Modified ArrayList: " + fruits);
    }
}

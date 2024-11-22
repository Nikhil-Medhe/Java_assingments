package ass;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ab63_Backward_Iteration_Example {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Create a ListIterator for the ArrayList
        ListIterator<String> listIterator = list.listIterator(list.size()); // Start at the end of the list

        // Iterate backward through the list
        System.out.println("Iterating backward through the ArrayList:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous(); // Get the previous element
            System.out.println(element); // Print the element
        }
    }
}

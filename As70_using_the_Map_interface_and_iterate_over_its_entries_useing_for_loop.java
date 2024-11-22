package ass;


import java.util.HashMap;
import java.util.Map;

public class As70_using_the_Map_interface_and_iterate_over_its_entries_useing_for_loop {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();

        // Adding entries to the HashMap
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 50);
        fruitPrices.put("Cherry", 150);
        fruitPrices.put("Date", 200);
        fruitPrices.put("Elderberry", 300);
        fruitPrices.put("Cherry", 150);
        fruitPrices.put("Cherry", 150);

        // Iterating over the entries of the HashMap using a for-each loop
        System.out.println("Fruit Prices:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            String fruit = entry.getKey(); // Get the key (fruit name)
            Integer price = entry.getValue(); // Get the value (price)
            System.out.println(fruit + ": $" + price);
        }
    }
}
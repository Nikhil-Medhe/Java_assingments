package ass;

import java.util.Scanner;

public class As25_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();
        
        // Method 1: Using StringBuilder
        String reversedStringUsingStringBuilder = reverseUsingStringBuilder(originalString);
        System.out.println("Reversed string using StringBuilder: " + reversedStringUsingStringBuilder);
        
        // Method 2: Using a loop
        String reversedStringUsingLoop = reverseUsingLoop(originalString);
        System.out.println("Reversed string using loop: " + reversedStringUsingLoop);
        
        // Method 3: Using recursion
        String reversedStringUsingRecursion = reverseUsingRecursion(originalString);
        System.out.println("Reversed string using recursion: " + reversedStringUsingRecursion);
        
        scanner.close();
    }

    // Method 1: Using StringBuilder
    private static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method 2: Using a loop
    private static String reverseUsingLoop(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Method 3: Using recursion
    private static String reverseUsingRecursion(String str) {
        if (str.isEmpty()) {
            return str; // Base case: if the string is empty
        }
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }
}

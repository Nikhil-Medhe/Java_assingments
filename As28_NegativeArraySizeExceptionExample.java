package ass;

import java.util.Scanner;

public class As28_NegativeArraySizeExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to create an array with a negative size
            int size = -5;
            int[] negativeArray = new int[size]; // This line will throw NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            // Catching and handling the exception
            System.out.println("Caught a NegativeArraySizeException: " + e.getMessage());
        }
    }
}
package ass;
import java.util.Scanner;

public class As73_ExceptionHandlingExample_using_Try_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Example 1: ArithmeticException
            System.out.print("Enter a number to divide 100: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            int result = 100 / divisor; // This may throw ArithmeticException if divisor is 0
            System.out.println("Result: " + result);

            // Example 2: ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.print("Enter an index to access the array (0-2): ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Number at index " + index + ": " + numbers[index]); // This may throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (Exception e) { // Catch-all for any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block will execute regardless of whether an exception occurred or not
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}
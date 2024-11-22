// Parent Class
package ass;

class Pa {
    // Non-static method in the parent class
    public void displayMessage() {
        System.out.println("This is a method from the Parent class.");
    }
}

// Child Class (inherits from Parent)
class Ch extends Pa {
    // Non-static method in the child class
    public void showDetails() {
        System.out.println("This is a method from the Child class.");
    }
}

// Main Class
public class As15_SingleLevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Child class
        Ch ch = new Ch();

        // Call methods from both Parent and Child classes
        ch.displayMessage(); // Method inherited from Parent class
        ch.showDetails();   // Method from Child class
    }
}


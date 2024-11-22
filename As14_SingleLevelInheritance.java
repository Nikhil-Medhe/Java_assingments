//As14_SingleLevelInheritance

// Parent Class
package ass;

class Parent {
    // Static method in parent class
    public static void greet() {
        System.out.println("Hello from the Parent class!");
    }

    // Another static method in parent class
    public static void showParentInfo() {
        System.out.println("This is the Parent class method.");
    }
}

// Child Class
class Child extends Parent {
    // Static method in child class
    public static void greet() {
        System.out.println("Hello from the Child class!");
    }

    // Another static method in child class
    public static void showChildInfo() {
        System.out.println("This is the Child class method.");
    }
}

// Main Class
public class As14_SingleLevelInheritance {
    public static void main(String[] args) {
        // Calling static methods from Parent class
        Parent.greet();
        Parent.showParentInfo();

        // Calling static methods from Child class
        Child.greet();
        Child.showChildInfo();

        // Accessing inherited static method from Parent class using Child class
        Child.showParentInfo();
    }
}

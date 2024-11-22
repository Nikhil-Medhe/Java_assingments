package ass;



	
	// Class demonstrating parameterized and non-parameterized this calling
	class Person {
	    private String name;
	    private int age;

	    // Non-parameterized constructor
	    public Person() {
	        // Calling the parameterized constructor with default values
	        this("Unknown", 0);
	        System.out.println("Non-parameterized constructor called.");
	    }

	    // Parameterized constructor
	    public Person(String name, int age) {
	        this.name = name; // Using this to refer to instance variable
	        this.age = age;   // Using this to refer to instance variable
	        System.out.println("Parameterized constructor called.");
	    }

	    // Method to display information
	    public void displayInfo() {
	        System.out.println("Name: " + this.name); // Using this to refer to instance variable
	        System.out.println("Age: " + this.age);   // Using this to refer to instance variable
	    }
	}

	// Main class to test the functionality
	public class As19_parameterized_and_nonparameterized_this_calling_statement {
	    public static void main(String[] args) {
	        // Creating an object using the non-parameterized constructor
	        Person person1 = new Person();
	        person1.displayInfo();
	        System.out.println();

	        // Creating an object using the parameterized constructor
	        Person person2 = new Person("Alice", 30);
	        person2.displayInfo();
	    }
	}


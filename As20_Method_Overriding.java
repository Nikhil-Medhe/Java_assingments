package ass;


	
	// Superclass
	class Car {
	    // Method to be overridden
	    public void sound() {
	        System.out.println("Car makes a sound");
	    }
	}

	// Subclass Bmw
	class Bmw extends Car {
	    // Overriding the sound method
	    @Override
	    public void sound() {
	        System.out.println("Bmw barks");
	    }
	}

	// Subclass Audy
	class Audy extends Car {
	    // Overriding the sound method
	    @Override
	    public void sound() {
	        System.out.println("Audy broom");
	    }
	}

	// Main class to test the functionality
	public class As20_Method_Overriding {
	    public static void main(String[] args) {
	        Car myCar;  // Declare an Car reference

	        // Create a Bmw object
	        myCar = new Bmw();
	        myCar.sound();  // Calls the Bmw's sound method

	        // Create a Audy object
	        myCar = new Audy();
	        myCar.sound();  // Calls the Audy's sound method
	    }
	}


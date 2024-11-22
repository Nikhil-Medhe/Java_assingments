package ass;


//Superclass
class Vehicle {
// Concrete method 1
public void start() {
   System.out.println("Vehicle is starting.");
}

// Concrete method 2
public void stop() {
   System.out.println("Vehicle is stopping.");
}
}

//Abstract class extending Vehicle
abstract class Bus extends Vehicle {
// Abstract method 1
public abstract void accelerate();

// Abstract method 2
public abstract void brake();

// Concrete method 1
public void honk() {
   System.out.println("Bus is honking.");
}

// Concrete method 2
public void turnOnLights() {
   System.out.println("Bus lights are on.");
}
}

//Subclass extending Bus
class SportsBus extends Bus {
// Implementing the abstract method accelerate
@Override
public void accelerate() {
   System.out.println("SportsBus is accelerating.");
}

// Implementing the abstract method brake
@Override
public void brake() {
   System.out.println("SportsBus is braking.");
}

// Concrete method 1
public void drift() {
   System.out.println("SportsBus is drifting.");
}

// Concrete method 2
public void openSunroof() {
   System.out.println("SportsBus sunroof is open.");
}
}

//Main class to test the functionality
public class As23_super_most_class_having_2CM {
public static void main(String[] args) {
   // Creating an object of SportsBus
   SportsBus myBus = new SportsBus();

   // Calling methods from the superclass
   myBus.start();             // Output: Vehicle is starting.
   myBus.stop();              // Output: Vehicle is stopping.

   // Calling methods from the abstract class
   myBus.honk();              // Output: Bus is honking.
   myBus.turnOnLights();      // Output: Bus lights are on.

   // Calling implemented abstract methods
   myBus.accelerate();        // Output: SportsBus is accelerating.
   myBus.brake();             // Output: SportsBus is braking.

   // Calling methods from the SportsBus class
   myBus.drift();             // Output: SportsBus is drifting.
   myBus.openSunroof();       // Output: SportsBus sunroof is open.
}
}

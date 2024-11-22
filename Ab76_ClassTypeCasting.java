package ass;

//Parent class
class Bike1 {
 public void sound() {
     System.out.println("Bike1 makes a sound");
 }
}

//Child class
class Car1 extends Bike1 {
 public void sound() {
     System.out.println("Car1 boom");
 }

 public void fetch() {
     System.out.println("Car1 a drive");
 }
}

public class Ab76_ClassTypeCasting {
 public static void main(String[] args) {
     // Create an object of the subclass
     Car1 Car1 = new Car1();

     // Upcasting: Subclass (Car1) to Superclass (Bike1)
     Bike1 Bike1 = Car1; // Implicit casting
     Bike1.sound(); // Calls the overridden method in Car1

     // Downcasting: Superclass (Bike1) to Subclass (Car1)
     if (Bike1 instanceof Car1) { // Check type before casting
         Car1 castedCar1 = (Car1) Bike1; // Explicit casting
         castedCar1.sound(); // Calls the overridden method in Car1
         castedCar1.fetch(); // Calls the subclass-specific method
     } else {
         System.out.println("Downcasting not possible");
     }
 }
}



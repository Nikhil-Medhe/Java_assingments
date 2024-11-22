package ass;

//Parent class
class Bike11 {
 public void sound() {
     System.out.println("Bike11 makes a sound");
 }
}

//Child class
class Car11 extends Bike11 {
 public void sound() {
     System.out.println("Car11 boom");
 }

 public void fetch() {
     System.out.println("Car11 a drive");
 }
}

public class As76_class_Typecasting {
 public static void main(String[] args) {
     // Create an object of the subclass
     Car11 Car11 = new Car11();

     // Upcasting: Subclass (Car11) to Superclass (Bike11)
     Bike11 Bike11 = Car11; // Implicit casting
     Bike11.sound(); // Calls the overridden method in Car11

     // Downcasting: Superclass (Bike11) to Subclass (Car11)
     if (Bike11 instanceof Car11) { // Check type before casting
         Car11 castedCar11 = (Car11) Bike11; // Explicit casting
         castedCar11.sound(); // Calls the overridden method in Car11
         castedCar11.fetch(); // Calls the subclass-specific method
     } else {
         System.out.println("Downcasting not possible");
     }
 }
}




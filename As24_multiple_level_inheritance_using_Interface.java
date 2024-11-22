package ass;

//First Interface
interface Mobile {
void eat(); // Abstract method
}

//Second Interface extending the first interface
interface Mammal extends Mobile {
void walk(); // Abstract method
}

//Third Interface extending the second interface
interface Moto extends Mammal {
void bark(); // Abstract method
}

//Concrete class implementing the third interface
class Labrador implements Moto {
// Implementing the eat method from Mobile interface
@Override
public void eat() {
   System.out.println("Labrador is eating.");
}

// Implementing the walk method from Mammal interface
@Override
public void walk() {
   System.out.println("Labrador is walking.");
}

// Implementing the bark method from Moto interface
@Override
public void bark() {
   System.out.println("Labrador is barking.");
}
}

//Main class to test the functionality
public class As24_multiple_level_inheritance_using_Interface {
public static void main(String[] args) {
   // Creating an object of Labrador
   Labrador myMoto = new Labrador();

   // Calling methods from the interfaces
   myMoto.eat();   // Output: Labrador is eating.
   myMoto.walk();  // Output: Labrador is walking.
   myMoto.bark();  // Output: Labrador is barking.
}
}



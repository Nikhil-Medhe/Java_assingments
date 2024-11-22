package ass;

//Superclass
class Tree {
 // Method to be overridden
 public void Color() {
     System.out.println("Tree makes a Color");
 }
}

//Subclass Bannana
class Bannana extends Tree {
 // Overriding the Color method
 @Override
 public void Color() {
     // Calling the superclass method
     super.Color(); // Calls the Tree's Color method
     System.out.println("Bannana yellow");
 }
}

//Subclass Mango
class Mango extends Tree {
 // Overriding the Color method
 @Override
 public void Color() {
     // Calling the superclass method
     super.Color(); // Calls the Tree's Color method
     System.out.println("Mango green");
 }
}

//Main class to test the functionality
public class As21_Method_Overriding_using_super_keyword

 {
 public static void main(String[] args) {
     Tree myTree;  // Declare an Tree reference

     // Create a Bannana object
     myTree = new Bannana();
     myTree.Color();  // Calls the Bannana's Color method

     // Create a Mango object
     myTree = new Mango();
     myTree.Color();  // Calls the Mango's Color method
 }
}


package ass;

//Abstract class
abstract class Shape {
 // Abstract method (no body)
 public abstract void draw();

 // Concrete method
 public void display() {
     System.out.println("This is a shape.");
 }
}

//Concrete class Circle that extends the abstract class Shape
class Circle extends Shape {
 // Implementing the abstract method
 @Override
 public void draw() {
     System.out.println("Drawing a Circle.");
 }
}

//Concrete class Rectangle that extends the abstract class Shape
class Rectangle extends Shape {
 // Implementing the abstract method
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle.");
 }
}

//Main class to test the functionality
public class As22_abstract_class_is_present_along_with_concrete_class {
 public static void main(String[] args) {
     // Creating objects of concrete classes
     Shape circle = new Circle();
     Shape rectangle = new Rectangle();

     // Calling the draw method
     circle.draw();       // Output: Drawing a Circle.
     rectangle.draw();    // Output: Drawing a Rectangle.

     // Calling the concrete method from the abstract class
     circle.display();    // Output: This is a shape.
     rectangle.display(); // Output: This is a shape.
 }
}

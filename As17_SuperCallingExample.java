package ass;

//Base Class
class A {
 // Constructor of Class A
 public A() {
     System.out.println("Constructor of Class A (Base Class) is called.");
 }
}

//Intermediate Class (Inherits from Class A)
class B extends A {
 // Constructor of Class B
 public B() {
     super(); // Explicit call to the constructor of Class A
     System.out.println("Constructor of Class B is called.");
 }
}

//Derived Class (Inherits from Class B)
class C extends B {
 // Constructor of Class C
 public C() {
     super(); // Explicit call to the constructor of Class B
     System.out.println("Constructor of Class C is called.");
 }
}

//Main Class
public class As17_SuperCallingExample {
 public static void main(String[] args) {
     // Create an object of Class C
     C objC = new C(); // This will invoke constructors in a chain
 }
}


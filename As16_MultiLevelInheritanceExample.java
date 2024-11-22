//Class A (Base Class)
package ass;



class A1 {
 // Non-static method in Class A
 public void methodA() {
     System.out.println("This is a non-static method in Class A.");
 }

 // Static method in Class A
 public static void staticMethodA() {
     System.out.println("This is a static method in Class A.");
 }
}

//Class B (Inherits from Class A)
class B1 extends A1 {
 // Non-static method in Class B
 public void methodB() {
     System.out.println("This is a non-static method in Class B.");
 }

 // Static method in Class B
 public static void staticMethodB() {
     System.out.println("This is a static method in Class B.");
 }
}

//Class C (Inherits from Class B)
class C1 extends B1 {
 // Non-static method in Class C
 public void methodC() {
     System.out.println("This is a non-static method in Class C.");
 }

 // Static method in Class C
 public static void staticMethodC() {
     System.out.println("This is a static method in Class C.");
 }
}

//Class D (Inherits from Class C)
class D1 extends C1 {
 // Non-static method in Class D
 public void methodD() {
     System.out.println("This is a non-static method in Class D.");
 }

 // Static method in Class D
 public static void staticMethodD() {
     System.out.println("This is a static method in Class D.");
 }
}

//Main Class
public class As16_MultiLevelInheritanceExample {
 public static void main(String[] args) {
     // Create an object of Class D
     D1 objD = new D1();

     // Call non-static methods (via object of Class D)
     objD.methodA(); // Inherited from Class A
     objD.methodB(); // Inherited from Class B
     objD.methodC(); // Inherited from Class C
     objD.methodD(); // Defined in Class D

     // Call static methods (directly via class names)
     A1.staticMethodA();
     B1.staticMethodB();
     C1.staticMethodC();
     D1.staticMethodD();
 }
}


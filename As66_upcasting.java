package ass;



import java.util.ArrayList;
import java.util.List;

public class As66_upcasting {

	public static void main(String[] args) {
		
ArrayList a1=new ArrayList();
List li=new ArrayList();//upcasting
li.add(45);
li.add("Nikhil");
li.add(null);
li.add("Nikhil");
List l1=new ArrayList();
l1.addAll(li);
System.out.println(l1);
	}

}



////Superclass
//class Bike {
// public void sound() {
//     System.out.println("Bike makes a sound");
// }
//}
//
////Subclass
//class Ameo extends Bike {
// @Override
// public void sound() {
//     System.out.println("Ameo barks");
// }
//
// public void fetch() {
//     System.out.println("Ameo fetches the ball");
// }
//}
//
//public class Ab66_UpcastingExample {
// public static void main(String[] args) {
//     // Create a Ameo object
//     Ameo Ameo = new Ameo();
//
//     // Upcasting: Treating Ameo as an Bike
//     Bike bike = Ameo; // Upcasting
//
//     // Call the overridden method
//     bike.sound(); // This will call the Ameo's sound method
//
//     // The following line will cause a compile-time error because
//     // bike reference cannot access Ameo's specific methods
//     // bike.fetch(); // Uncommenting this line will cause an error
//
//     // To demonstrate downcasting, we can cast back to Ameo
//     if (bike instanceof Ameo) {
//         Ameo specificAmeo = (Ameo) bike; // Downcasting
//         specificAmeo.fetch(); // Now we can call the Ameo's specific method
//     }
// }
//}


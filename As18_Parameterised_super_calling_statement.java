package ass;

//Superclass
class Animal {
 private String name;
 private int age;

 // Parameterized constructor
 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayInfo() {
     System.out.println("Animal Name: " + name);
     System.out.println("Animal Age: " + age);
 }
}

//Subclass
class Dog extends Animal {
 private String breed;

 // Parameterized constructor
 public Dog(String name, int age, String breed) {
     // Calling the superclass constructor
     super(name, age);
     this.breed = breed;
 }

 public void displayInfo() {
     super.displayInfo(); // Call to superclass method
     System.out.println("Dog Breed: " + breed);
 }
}

//Another subclass
class Cat extends Animal {
 private String color;

 // Parameterized constructor
 public Cat(String name, int age, String color) {
     // Calling the superclass constructor
     super(name, age);
     this.color = color;
 }

 public void displayInfo() {
     super.displayInfo(); // Call to superclass method
     System.out.println("Cat Color: " + color);
 }
}

//Main class to test the functionality
public class As18_Parameterised_super_calling_statement {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy", 3, "Golden Retriever");
     Cat cat = new Cat("Whiskers", 2, "Black");

     System.out.println("Dog Information:");
     dog.displayInfo();
     System.out.println();

     System.out.println("Cat Information:");
     cat.displayInfo();
 }
}
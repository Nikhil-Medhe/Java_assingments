package ass;


public class As56_BaseClass {
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable"; // No access modifier = package-private
    private String privateVar = "Private Variable";

    public void showVariables() {
        System.out.println("Accessing from BaseClass:");
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}

//package package2;
//
//import package1.BaseClass;
//
//public class SubClass extends BaseClass {
//
//    public void accessBaseClassVariables() {
//        System.out.println("Accessing from SubClass in another package:");
//        
//        // Accessing members of BaseClass
//        System.out.println("Public: " + publicVar); // Accessible
//        System.out.println("Protected: " + protectedVar); // Accessible due to inheritance
//        // System.out.println("Default: " + defaultVar); // Not accessible (package-private)
//        // System.out.println("Private: " + privateVar); // Not accessible (private)
//    }
//
//    public static void main(String[] args) {
//        SubClass obj = new SubClass();
//
//        // Access base class variables
//        obj.accessBaseClassVariables();
//    }
//}


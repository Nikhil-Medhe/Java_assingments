package Assignment4;

public class constructor_class {

	constructor_class()
	{
		System.out.println("1st");
	}
	
	constructor_class(int a)
	{
		System.out.println("2nd");
	}
	
	public static void main(String[] args) {
		
		new constructor_class();
		new constructor_class();
		new constructor_class();
		new constructor_class();
		new constructor_class(500);
		new constructor_class(500);
	
	}
}

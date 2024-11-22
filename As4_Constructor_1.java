package ass;


public class As4_Constructor_1 {

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		As4_Constructor_1 c1=new As4_Constructor_1();
		c1.main();
		main("Ramu",'M');
	
	}
	void main() 
	{
		System.out.println("Main Method with no argument");
	}
	static void main(String name,char gender) 
	{
		System.out.println("Main Method with argument as String and gender");
	}
}

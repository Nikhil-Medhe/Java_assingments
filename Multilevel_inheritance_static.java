package Assignment16;


class class33 //parent class3
{
	
	static void add()
	{
		
	System.out.println("Non static Multilevel_inheritance class3");	
	}
}

class class22 extends class33 // parent class2 

{
	static void mul()
	{
		System.out.println("Non static Multilevel_inheritance class2");	
	}
	
	
}
public class Multilevel_inheritance_static extends class22// Child class (class1)
{

	public static void main(String[] args) {
		
		mul();
		add();
		System.out.println("Child class main method");
		
	}
	
}

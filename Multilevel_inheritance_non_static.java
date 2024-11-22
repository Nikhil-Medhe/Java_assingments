package Assignment16;

class class3 //parent class3
{
	
	 void add()
	{
		
	System.out.println("Non static Multilevel_inheritance class3");	
	}
}

class class2 extends class3 // parent class2 

{
	 void mul()
	{
		System.out.println("Non static Multilevel_inheritance class2");	
	}
	
	
}


public class Multilevel_inheritance_non_static {

	public static void main(String[] args) {
		
		System.out.println("Non static main method ");
		class2 a1=new class2();
		a1.mul();
		a1.add();
		
	}
}

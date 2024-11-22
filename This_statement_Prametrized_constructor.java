package Assignment19;

public class This_statement_Prametrized_constructor {
	This_statement_Prametrized_constructor()
	{
		this(100, 3000);
		System.out.println("1st");
	}

	This_statement_Prametrized_constructor(int a, int b)
	{
		this("nikhil", 20);
		System.out.println("2nd");
	}
	
	This_statement_Prametrized_constructor(int a)
	{
	
		System.out.println("3");
	}


	This_statement_Prametrized_constructor(String a, int b)
	{
		this(20);
		System.out.println("4");
	}
	public static void main(String[] args) {
		
		
		new This_statement_Prametrized_constructor();
	}
	
}


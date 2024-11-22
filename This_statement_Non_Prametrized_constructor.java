package Assignment19;

public class This_statement_Non_Prametrized_constructor {

	This_statement_Non_Prametrized_constructor()
	{
		
		System.out.println("1st");
	}

	This_statement_Non_Prametrized_constructor(int a, int b)
	{
		this();
		System.out.println("2nd");
	}
	
	
	
	public static void main(String[] args) {
		
		
		new This_statement_Non_Prametrized_constructor(100, 2000);
	}
	
}

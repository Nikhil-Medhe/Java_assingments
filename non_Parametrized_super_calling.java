package Assignment18;

class ame
{
	ame ()
	{
		System.out.println("2");
	}
}

class abc extends ame
{
	
	abc()
	{
		super();
		System.out.println("1");
	}
}

public class non_Parametrized_super_calling extends abc {

	non_Parametrized_super_calling()
	
	{
		super();
		System.out.println("main");
	}

	public static void main(String[] args) {
		new non_Parametrized_super_calling();
	}
}

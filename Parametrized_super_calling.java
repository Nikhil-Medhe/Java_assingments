package Assignment17;

class me
{
	me(String a)
{
		System.out.println("Parent");
	
}
}
class you extends me
{
	you(int a,int b) 
	{
		super("nik");
		System.out.println("parent2");
	}
}

class she extends you
{
	she() 
	
	{
		super(10, 200);
		System.out.println("3");
	}
}
public class Parametrized_super_calling extends she {
	
	Parametrized_super_calling()
	
	{
		super();
		System.out.println("main");
	}

	public static void main(String[] args) {
		new Parametrized_super_calling();
	}

}

package Assignment21;

class parent_class
{
	void login()
	{
		System.out.println("Login with mobile no 2");
	}
}

class child_class extends parent_class
{
	void login()
	{
	super.login();
		System.out.println("Login with email 1");
	}

}

public class Method_Overriding_super_keyword extends child_class{

	public static void main(String[] args) {
		
		child_class a1=new child_class();
		a1.login();
	}
}

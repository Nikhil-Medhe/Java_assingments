package Assignment20;

class class11 {

	void part ()
	{
		System.out.println("new job");
	}
}

class classs22 extends class11  {

	void part ()
	{
		System.out.println("new part");
	}
}

public class methodoverriding extends classs22 {

	
	public static void main(String[] args)
	{
		classs22 m1=new classs22();
		m1.part();
	}
}

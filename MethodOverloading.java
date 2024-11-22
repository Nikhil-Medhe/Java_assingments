package Assignment3;

public class MethodOverloading {

	static void addition(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void addition(double a, int b )
	{
		
		double sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		addition(2.44, 3.990);
		addition(4.6, 6);
		addition(3, 05);

	}

}

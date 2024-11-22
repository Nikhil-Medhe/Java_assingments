package Assignment2;

public class Addition {
	

	static void addition() {

		int a=200;
		int b=500;
		int sum=a+b;
		System.out.println("the addition of two number-->"+ sum);

	}

	static void sub () {
		int a=20;
		int b=5;
		int sub=a-b;
		System.out.println("the sub is-->"+ sub);

	}

	static void mul () {
		int a=2;
		int b=5;
		int mul=a*b;
		System.out.println("the mul is-->"+ mul);

	}
	static void div () {
		int a=20;
		int b=5;
		int div=a/b;
		System.out.println("the div is-->"+ div);
	}

	static void mod () {
		int a=21;
		int b=5;
		int mod=a%b;
		System.out.println("the mod is-->"+ mod);
	}

	public static void main(String[] args) {

		addition();
		sub();
		mul();
		div();
		mod();
	}
}

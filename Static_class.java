package Assignment1;

public class Static_class {
	public static void Start() {
		System.out.print("this is start process ");
	}
	
	static void process() {
		System.out.println("this is process");
	}
	
	private static void ending() {
		System.out.println("this is ending");
	}
	
	protected static void newprocess() {
		System.out.println("this is protected");
	}
	
	
	static void intergermethod() {
		int x= 5;
		System.out.println(x);
	}
	
	static void my_person() {
		
		char str='n';
		System.out.println(str);
	
	
	}
	
	public static void main(String[] args) {
		System.out.println("HI");
		Start();
		process();
		ending();
		newprocess();
		intergermethod();
		my_person();
		
		
	}
}



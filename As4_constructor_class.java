package ass;

public class As4_constructor_class {

	As4_constructor_class()
		{
			System.out.println("1st");
		}
		
	As4_constructor_class(int a)
		{
			System.out.println("2nd");
		}
		
		public static void main(String[] args) {
			
			new As4_constructor_class();
			new As4_constructor_class();
			new As4_constructor_class();
			new As4_constructor_class();
			new As4_constructor_class(500);
			new As4_constructor_class(500);
		
		}
	}



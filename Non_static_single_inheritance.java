package Assignment15;


	
	class one55 //Parent class/ Super class// non static 

	{
		
		 void addd()
		{
			System.out.println("add");
		}
		
		 void subb()
		{
			System.out.println("sub");
		}
	}


	public class Non_static_single_inheritance extends one55 {  //Sub class / child class

		 void mull()
		{
			System.out.println("mul");
		}
		
		 void divv()
		{
			System.out.println("div");
		}
		
		public static void main(String[] args) {
			Non_static_single_inheritance n1=new  Non_static_single_inheritance();
			
			n1.mull();
			n1.divv();
			n1.addd();
			n1.subb();
			
}
}
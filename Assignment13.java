package Assignment13;

public class Assignment13 {

		
		

			void start() {
			System.out.println("Hii wait for 5 sec ");
			}
			void welcom() {
			System.out.println("Welcom to java ");
			}
			public static void main(String[] args) throws InterruptedException {
				Assignment13 t1= new Assignment13();
			t1.start();
			Thread.sleep(5000);
			t1.welcom();
	}
}

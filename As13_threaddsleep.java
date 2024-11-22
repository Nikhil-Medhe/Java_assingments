package ass;

public class As13_threaddsleep {

	
	

	void start() {
	System.out.println("Hii wait for 5 sec ");
	}
	void welcom() {
	System.out.println("Welcom to java ");
	}
	public static void main(String[] args) throws InterruptedException {
		As13_threaddsleep t1= new As13_threaddsleep();
	t1.start();
	Thread.sleep(5000);
	t1.welcom();
}
}
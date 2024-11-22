package ass;

class Amazone{
	
	
	private String emailid="abc@gmail.com";

	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	
	
}
public class AS74_Encapsulation extends Amazone{

	public static void main(String[] args) {
		
		AS74_Encapsulation as=new AS74_Encapsulation();
		as.setEmailid("medheni.com");
		System.out.println(as.getEmailid());
	}

	
}

package ass;



import java.util.Date;

public class As50_current_date_and_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d1=new Date();
long d2=d1.getTime();
Date d3=new Date(d2);
System.out.println(d3.toString());


	}

}


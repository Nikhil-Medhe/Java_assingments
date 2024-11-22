package ass;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class As72_MAP_ROLLNO {

	public static void main(String[] args) {
		
Map<Integer,String> m1=new HashMap<Integer,String>();

m1.put(1, "NIKHIL");
m1.put(2, "AJAY");
m1.put(3, "YASH");

if(m1.containsKey(2)&& m1.containsValue("AJAY"))
		{


System.out.println("2=AJAY");

		}
	}
}


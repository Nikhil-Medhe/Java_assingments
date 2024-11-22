package ass;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class As69_Map_interface_and_iterate_over_its_entries_using_an_Iterator_with_a_while_loop {

	public static void main(String[] args) {
		
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "Ajay");
		m1.put(2,"Yash");
		m1.put(3, "Ajay");
		m1.put(4, "Nikhil");
	Iterator<Map.Entry<Integer, String>> m2=m1.entrySet().iterator();
	while(m2.hasNext())
	{
		System.out.println(m2.next());
	
	
	}

}

}

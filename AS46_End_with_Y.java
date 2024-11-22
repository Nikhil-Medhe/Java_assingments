package ass;

;

public class AS46_End_with_Y {

	public static void main(String[] args) {
		
String s1=("I am a Boy");
boolean s2=s1.matches("(.*)y");
if(s2==true)
{
	System.out.println("Ends with y");
}
else
	System.out.println("Does not ends with y");
	}

}


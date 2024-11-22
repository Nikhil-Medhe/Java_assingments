package ass;

import java.util.Arrays;

public class As36_alphabates_char_digits_spaces_and_special_char_from_the_give_strings {
	static int countofalphabet;
	static int countofdigit;	
	static int space;

	public static void main(String[] args) {
		
String s="Kv no 2 Adoor";
char[]c1=s.toCharArray();
System.out.println(Arrays.toString(c1));

for (int i=0;i<s.length();i++)
{
boolean b1=Character.isAlphabetic(c1[i]);
if(b1==true)
{
countofalphabet++;

}
boolean b2=Character.isDigit(c1[i]);
if(b2==true)
{
	countofdigit++;	
}
boolean b3=Character.isWhitespace(c1[i]);
if(b3==true)
{
	space++;
}
	
}
int spclcount=s.length()-(countofalphabet+countofdigit+space);
System.out.println(countofalphabet);
System.out.println(countofdigit);
System.out.println(space);
}}
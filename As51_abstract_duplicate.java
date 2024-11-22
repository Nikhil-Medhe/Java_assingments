package ass;


interface grantparent11
{
	void method();
	void method2();
}
abstract class father11 implements grantparent11
{
	abstract void method3();
	abstract void method4();
	void method5()
	{
	}
	void method6()
	{
	}
	

}
public class As51_abstract_duplicate extends father11
{
	void method7()
	{
	}
	void method8()
	{
	}
	public static void main(String[] args) {
		As51_abstract_duplicate as=new As51_abstract_duplicate();
		as.method2();
		}
		
	@Override
	public void method() {
		
		
	}
	@Override
	public void method2() {
		
		
	}
	@Override
	void method3() {
		
		
	}
	@Override
	void method4() {
		
		
	}

	}




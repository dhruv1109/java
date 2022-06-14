class xx
{
	xx()
	{
		System.out.println("Super class");
	}
}
class yy extends xx
{
	yy()
	{
		// super();
		System.out.println("Sub class");
	}
}
public class test2 {

	public static void main(String[] args) {
		
		yy o=new yy();
		// the op is Super class Sub class
		// this is because in case of default const,
		// super class const is created by default
		// by java compiler if we don't write it
	}

}

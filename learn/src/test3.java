class xxx
{
	xxx(int a)
	{
		System.out.println("Super class" + a);
	}
}
class yyy extends xxx
{
	yyy()
	{
		super(11);
		System.out.println("Sub class");
	}
}
public class test3 {

	public static void main(String[] args) {
		
		yyy o=new yyy();
		// in case of parameterized constructor, 
		// it is compulsory to use super with parameters passed
	}

}

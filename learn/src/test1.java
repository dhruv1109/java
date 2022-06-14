
class X
{
	void show()
	{
		System.out.println("Super class");
	}
}
class Y extends X
{
	void show()
	{
		super.show();
		System.out.println("Sub class");
	}
}

public class test1 {

	public static void main(String[] args)
	{
		Y o= new Y();
		o.show();
		
	}
}


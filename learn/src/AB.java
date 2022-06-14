
public class AB {
	
	int a=10;
	static int b=20;
	{
		System.out.println("Instance");
		System.out.println(a+" "+b);
	}
	AB()
	{
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	static {
		System.out.println("static block");
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		AB obj=new AB();
		
		// Static
		// Instance
        // Default
	}

}

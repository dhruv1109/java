public class this_x {

	int a;
	this_x()
	{
		System.out.println("Default cons");
	}
	this_x(int a)
	{
		this();
		this.a=a;
	}
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		this_x obj=new this_x(100);	
		obj.show();
	}

}


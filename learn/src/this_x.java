public class this_x {

	int a;
	this_x(int a)
	{
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


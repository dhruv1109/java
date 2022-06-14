
public class this_a {

	void show()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		
		this_a obj=new this_a();
		System.out.println(obj);	
		obj.show();
	}

}

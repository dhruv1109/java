
public class string {

	public static void main(String[] args) {
		
		String s="Dhruv";
		int l=s.length();
		System.out.println(l);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String s2=new String("Dhruv");
		if(s==s2)
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		//The output is not equal
	
		//use == operators for memory location of objects in a heap
		//== checks if both objects point to the same location or not
		//.equals() method for content comparison. 
		//.equals() evaluates to the comparison of values in the objects.
		
		if(s.equals(s2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		
	}

}


public class second {

	int a=10; // Instance Variable
	static char b='x'; // Static Variable
	public static void main(String[] args) {
		
		int c=34; // Local Variable
		second s=new second(); //object
		System.out.println(s.a);
		System.out.println(b); // static var can be accessed directly
		System.out.println(c);
	}
}

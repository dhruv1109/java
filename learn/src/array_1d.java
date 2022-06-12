import java.util.Scanner;
import java.util.Arrays;

public class array_1d {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		
		Arrays.sort(a);
		System.out.print("Array elements are : ");
		for(int x:a)
			System.out.print(x+" ");

	}

}

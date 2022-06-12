import java.util.Scanner;
import java.util.Arrays;

public class array_2d {

	public static void main(String[] args) {
		
		int a[][]=new int[2][2];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				a[i][j]=s.nextInt();
		}		
		System.out.print("Array elements are : \n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				System.out.print(a[i][j]+" ");
			
			System.out.println();
		}
			

	}

}

import java.util.Scanner;

class bank
{
	private double bal=5000;
	private int pwd;
	
	public void deposite(double money)
	{
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234)
		{
			bal+=money;
			System.out.println("Deposited Money : "+money);
			System.out.println("Total Balance : "+bal);
		}
		else
		{
			System.out.println("Incorrect Password...");			
		}
	}
	public void withdraw(double money)
	{
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234)
		{
			bal-=money;
			System.out.println("Deposited Money : "+money);
			System.out.println("Total Balance : "+bal);
		}
		else
		{
			System.out.println("Incorrect Password...");			
		}
	}
	public void checkBalance()
	{
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234)
		{
			
			System.out.println("Total Balance : "+bal);
		}
		else
		{
			System.out.println("Incorrect Password...");			
		}
	}
}
public class encapsulation {

	public static void main(String[] args) {
		bank b=new bank();
		int ch;
		System.out.println("1. Deposite ");
		System.out.println("2. Withdraw ");
		System.out.println("3. Check Balance ");
		
		System.out.println("enter your choice : ");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		switch(ch)
		{
			case 1: b.deposite(2000.0);
			break;
			case 2: b.withdraw(1000.0);
			break;
			case 3: b.checkBalance();
			break;
			default:System.out.println("Invalid Choice");
		}
	}

}

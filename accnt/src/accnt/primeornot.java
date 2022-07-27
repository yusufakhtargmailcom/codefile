package accnt;
import java.util.Scanner;
public class primeornot{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0) {
				flag=true;
				
			}
		}
		if(flag)
		{
			System.out.println(n+" it is not a prime number");
			
		}else
		{
			if(n==1) {
				System.out.println(n+" it is not a prime number");
			}else
			{
				System.out.println(n+"it is a prime number");
			}
	}
	}
}

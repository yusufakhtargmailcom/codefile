package accnt;
import java.util.Scanner;

public class qn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first digit");
		int n=sc.nextInt();
		int temp=n,rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("before the reversing no:" + temp);
		System.out.println("after the reversing no:" +rev);

	}

}

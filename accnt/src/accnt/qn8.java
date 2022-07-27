package accnt;

import java.util.Scanner;

public class qn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=n,rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev==temp)
		{
			System.out.println(rev+" it is a palindrome number");
		}
		else
		{
			System.out.println(rev+" it is not a palindrome number");
		}
		

	}

}

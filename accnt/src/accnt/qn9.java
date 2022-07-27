package accnt;
import java.util.Scanner;


public class qn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		while(count<5)
		{
			if((n%2==0) && (n%3==0) && (n%5==0))
			{
				System.out.print(n+ " ");
				count++;
						
			}
			n++;
		}

	}

}

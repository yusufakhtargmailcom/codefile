package accnt;
import java.util.Scanner;

public class qn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Take input");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}

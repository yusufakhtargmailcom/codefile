package accnt;
import java.util.Scanner;

public class addnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first range of no");
		int n=sc.nextInt();
		int []a=new int[n];
		int sum=0;
		System.out.println("Enter the array value");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("The sum of all : " +sum);
		System.out.println("The average: "+(sum/(float)n));

	}

}

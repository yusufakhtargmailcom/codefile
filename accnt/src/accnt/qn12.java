package accnt;
import java.util.Scanner;

public class qn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of the number");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the value of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter number for the searching");
		int k=sc.nextInt();
		int d=search(n,a,k);
		System.out.println(d);

	}
	static int search(int n, int[] a, int k) {
		for(int i=0;i<n;i++) {
			if(a[i]==k)
			{
				return i;
			}
		}
		return -1;
	}

}

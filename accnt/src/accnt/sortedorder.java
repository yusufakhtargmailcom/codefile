package accnt;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;


public class sortedorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		Arrays.parallelSort(a);
		for(int i:a) {
			System.out.print(i+ " ");
		}

	}

}

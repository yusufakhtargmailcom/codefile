package wedproject;

import java.util.Scanner;

public class qqq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the number in array");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the value of the array");
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			
		}
		try {
			System.out.println("Enter the index of the array element you want to acess");
			int k=sc.nextInt();
			System.out.println("The array element at index "+k+ " "+a[k-1]);			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			
		}

	}

}

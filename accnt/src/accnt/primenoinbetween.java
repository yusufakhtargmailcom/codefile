package accnt;

import java.util.Scanner;

public class primenoinbetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no of range");
		int n=sc.nextInt();
		System.out.println("Enter last no ofd range ");
		int k=sc.nextInt();
		for(int i=n; i<=k;i++)
		{
			int flag=0;
			for(int j=2;j<=(int)Math.sqrt(i);j++) {
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(i+" ");
			}
		}
		

	}

}

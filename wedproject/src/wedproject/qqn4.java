package wedproject;

import java.util.Scanner;

public class qqn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
try {
	System.out.println("Enter a number");
	int a=sc.nextInt();
	System.out.println("Enter another number");
	int b=sc.nextInt();
	int c=a/b;
	System.out.println("the value of two number is : "+c);
	System.out.println("Successfully run");
	
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}

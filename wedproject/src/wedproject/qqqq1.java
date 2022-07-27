package wedproject;

public class qqqq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=Integer.parseInt(args[0]);
			
		
			System.out.println("The square of the number is " +(int)Math.pow(a, 2));
			System.out.println("The work has done successfully");
			
		}
		catch(NumberFormatException o)
		{
			System.out.println(o);
			System.out.println("Entered input is not a valid format for an Integer");
			
		}


	}

}

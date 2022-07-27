package fridaycode;
class Calculator{
	static int powerint(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	static double powerdouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
}

public class qqn2 {
	public static void main(String[] args)
	{
		System.out.println(Calculator.powerint(2, 4));
		System.out.println(Calculator.powerdouble(2.5, 4.6));
	}

}

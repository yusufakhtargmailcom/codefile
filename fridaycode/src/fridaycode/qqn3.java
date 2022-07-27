package fridaycode;
import java.util.Scanner;
class Patient{
	String name;
	double height,weight;
	Patient(String name,double height,double weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	double BMI()
	{
		return weight / (height*height);
	}
}

public class qqn3 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name of the patient");
	String name=sc.nextLine();
	System.out.println("enter the height in m");
	double height=sc.nextDouble();
	System.out.println("enter the weight inkg");
	double weight=sc.nextDouble();
	Patient p=new Patient(name,height,weight);
	System.out.println(p.name+" having BMI of "+p.BMI());
	
}
}

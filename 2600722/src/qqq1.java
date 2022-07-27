import java.util.Scanner;

//import java.util.Scanner;
public class qqq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee(12341,"Ramesh","Ramesh@yahoo.com",35000f);
		Employee e1=new Employee(12342,"Ram","Ram@yahoo.com",45000f);
		Employee e2=new Employee(12343,"Harry","Harry@yahoo.com",25000f);
		Employee e3=new Employee(12344,"Raju","Raju@yahoo.com",85000f);
		Employee e4=new Employee(12345,"Sandy","Sandy@yahoo.com",65000f);
		Employee e5=new Employee(12346,"Krish","Krish@ahoo.com",45000f);
		e.GetEmployeeDetails();
		EmployeeDb ed=new EmployeeDb();
		ed.addEmployee(e);
		ed.addEmployee(e1);
		ed.addEmployee(e2);
		ed.addEmployee(e3);
		ed.addEmployee(e4);
		ed.addEmployee(e5);
		System.out.println("Enter Employee Id tp delete his details");
		int emp=sc.nextInt();
		System.out.println("Employee Details deleted :"+ ed.deleteEmployee(emp));
		System.out.println("Enter employee id to show his PaySlip");
		emp=sc.nextInt();
		System.out.println("----employee payslip detail----");
		System.out.println(ed.showPaySlip(emp));

	}

}

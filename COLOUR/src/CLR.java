import java.util.Scanner;
public class CLR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char S1=sc.next().charAt(0);
		if(Character.isLowerCase(S1));
		{
			S1=Character.toUpperCase(S1);
		}
		switch(S1)
		{
		case 'B' : System.out.println("Blue");
		break;
		case 'G' : System.out.println("Green");
		break;
		}

	}

}

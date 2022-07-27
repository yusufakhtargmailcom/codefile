import java.util.ArrayList;
import java.util.Iterator;
public class qqq1 {

	public static void main(String[] args) {
		
	ArrayList<Number> li=new ArrayList<>();
		li.add(23);
		li.add(45);
		li.add(7.22);
		li.add(56);
		li.add(23.2f);
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}

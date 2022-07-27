import java.util.*;
public class qqq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ve=new Vector<>();
		ve.add(23);
		ve.add(67);
		ve.add(670000);
		ve.add(56);
		ve.remove(0);
		Collections.sort(ve);
		System.out.println(ve);
		Iterator itr=ve.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		
		

	}

}

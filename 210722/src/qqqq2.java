import java.util.*;
public class qqqq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<>();
		li.add("Hello");
		li.add("YUSUF");
		li.add("AKHTAR");
		li.add("HOW ARE YOU");
		li.add("CAN YOU HERE");
		li.add("NEED SOME MORE APPROACH");
		System.out.println("head : "+li.getFirst());
		System.out.println("last :"+li.getLast());
		System.out.println("removing last element :"+li.pollLast());
		Iterator itr=li.iterator();
		System.out.println("printing all element");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("      ");
		System.out.println("printing all element using method 2");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(i+"  "+li.get(i));
			
		}
	}
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class qqq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String,String> h1=new HashMap<>();
		h1.put("Delhi","Batore");
		h1.put("Karnataka","idli");
		h1.put("Rajasthan","Raab");
		h1.put("Mumbai","Pav");
		h1.put("Bihar","Lithi");
		h1.put("Jharkhand","Dhusska");
		Set<Entry<String,String>> set=h1.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		System.out.println("_______for finding the key________");
		System.out.println("Enter the key to search");
		String s1=sc.nextLine();
		int d=0;
		while(it.hasNext())
		{
			Map.Entry<String,String> k=it.next();
			// System.out.println("key "+k.getKey()+" Value : "+k.getValue())
			if(k.getKey().contentEquals(s1))
			{
				System.out.println("Key found");
				System.out.println("Place :"+k.getKey()+" || Dish : "+k.getValue());
				}
			
		}
		if(d==0)
		{
			System.out.println("Key not found");
			
		}
		System.out.println("_________For finding the value________");
		System.out.println("Enter a value to search");
		s1=sc.nextLine();
		d=0;
		Set<Entry<String,String>> set2=h1.entrySet();
		Iterator<Entry<String,String>> itr1=set2.iterator();
		while(itr1.hasNext())
		{
			Map.Entry<String,String> k=itr1.next();
			if(k.getValue().equals(s1))
			{
				System.out.println("Value Fopund");
				System.out.println("Dish :"+k.getValue() +" || Place : "+k.getKey());
				d=1;
				
				
			}
		}
		if(d==0)
		{
			System.out.println("Value not found");
			
		}
		System.out.println();
		System.out.println("_______for iterating all list_________");
		Set<Entry<String,String>> set3=h1.entrySet();
		Iterator<Entry<String,String>> itr3=set3.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		
		
		
		

	}

}

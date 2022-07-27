import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class qqqq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String,String> s=new HashMap<>();
		s.put("Andhra pardesh", "Amaravati");
		s.put("Arunachal pardesh", "Itanagar");
		s.put("Assam", "Dispur");
		s.put("Bihar", "Patna");
		s.put("Chattisgarh", "Raipur");
		
		Set<Entry<String,String>> set= s.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		System.out.println("State"+"\t"+"Capital");
		System.out.println("___________________");
		while(itr.hasNext())
		{
			Map.Entry<String,String> k=itr.next();
			System.out.println(k.getKey()+"\t"+k.getValue());
		}
		

	}

}

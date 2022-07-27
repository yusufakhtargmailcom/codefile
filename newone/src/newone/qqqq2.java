package newone;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class qqqq2 {

	@Test
	void test() {
		ArrayList<String>h1=new ArrayList<>();
		h1.add("Yusuf");
		h1.add("dikshit");
		h1.add("Hello");
		Employee e=new Employee();
		assertEquals("Not FOUND",e.findname(h1, "Yusuf"));
		
	}

}

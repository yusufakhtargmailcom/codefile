package newone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2 {
	StringBuilder sb=new StringBuilder();
	boolean palindromeCheck(String S1)
	{
		sb.append(S1);
		sb=sb.reverse();
		if(sb.toString().contentEquals(S1))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
}


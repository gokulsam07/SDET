package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class FaultyKeyBoardRedo {
	
	//ip: String
	//op : String
	//logic - init stringbuilder
	//1. Run a for loop till last element
	//2. If the char is i, reverse the sb
	//3. else append the charAt(i) of the string
	// return the sb as string
	//TC : O[N2], SC: O[N]

	public String faulty(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='i') {
				sb.reverse();
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		return new String(sb);
	}
	
	
	@Test
	public void test1() {
		Assert.assertEquals("poetha", faulty("ethiopia"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("rtsng", faulty("string"));
	}

	@Test
	public void test3() {
		Assert.assertEquals("navsa", faulty("isaivani"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals("aaabbccnabb", faulty("iiiiaabbccnabiaibii"));
		//aabbccnab // banccnnaaa //aaannccnabb
	}

}

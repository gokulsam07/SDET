package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class MergeAlternateStringChar {

	//Input: two strings s1 & s2
	//Output: merged string
	//Logic:
	//1. Initialize String s ="";
	//2. if length of s1 & s2 is equal, in a for loop append the chatAt(i) to s and return s
	//3. if length of s1>s2, run the for loop till index size < s2.length (so that smallest sized word will be appended
	//4. outside the loop, in a while loop append the charAt(i) till index becomes equal to the size of larger word
	//5. if length of s2>s1, run the for loop till index size < s1.length (so that smallest sized word will be appended
	//6. outside the loop, in a while loop append the charAt(i) till index becomes equal to the size of larger word

	public String merge(String s1,String s2) {
		String s = "";
		if(s1.length()==s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				s=s+s1.charAt(i)+s2.charAt(i);
			}
			return s;
		}

		else if(s1.length()>s2.length()) {
			int i=0;
			for (i = 0; i <s2.length(); i++) {
				s=s+s1.charAt(i)+s2.charAt(i);
			}

			while(i!=s1.length()) {
				s=s+s1.charAt(i);
				i++;
			}
			return s;
		}
		else {
			int i=0;
			for (i = 0; i <s1.length(); i++) {
				s=s+s1.charAt(i)+s2.charAt(i);
			}

			while(i!=s2.length()) {
				s=s+s2.charAt(i);
				i++;
			}
			return s;
		}

	}
	@Test
	public void tst1() {
		Assert.assertEquals("apbqcr", merge("abc","pqr"));
	}
	@Test
	public void tst2() {
		Assert.assertEquals("apbqrs", merge("ab","pqrs"));
	}
	@Test
	public void tst3() {
		Assert.assertEquals("apbqcd", merge("abcd","pq"));
	}

	@Test
	public void tst4() {
		Assert.assertEquals("a", merge("a",""));
	}
}

package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class FindAddedChar {

	//Input: Two strings with one random char in any place in string t
	//Output: return the additional char
	//Logic:
	//1. Initialize sum
	//2. In a for loop, add the charAt index i to sum --> for second string
	//3. Do the same for first string s in another for loop
	//4. the sum will have the ASCII value of the additional char
	//5. cast and return the sum 

	public char findChar(String s, String t) {
		int sum=0;
		for (int i = 0; i < t.length(); i++) {
			sum=sum+t.charAt(i);
		}

		for (int j = 0; j < s.length(); j++) {
			sum=sum-s.charAt(j);
		}

		return (char)sum;
	}
	@Test
	public void tst1() {
		Assert.assertEquals('e', findChar("dbca","eabdc"));
	}

	@Test
	public void tst2() {
		Assert.assertEquals('a', findChar("","a"));
	}
}

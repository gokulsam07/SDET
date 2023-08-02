package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWord {

	//Input: String with space and words
	//Output: Length of the last word 
	//Logic: 
	//1. trim the string to remove trailing and ending spaces
	//2. take subString using (check.lastIndexOf(" ")+1, check.length()) 
	//3. return the length

	public int lnCheck(String s) {
		String check = s.trim();
		return check.substring(check.lastIndexOf(" ")+1, check.length()).length();
	}
	@Test
	public void tst1() {

		Assert.assertEquals(5, lnCheck("Hello World"));
	}
	@Test
	public void tst2() {

		Assert.assertEquals(4, lnCheck("   fly me   to   the moon  "));
	}
	@Test
	public void tst3() {

		Assert.assertEquals(6, lnCheck("luffy is still joyboy"));
	}

	@Test
	public void tst4() {

		Assert.assertEquals(5, lnCheck("  luffy "));
	}
}

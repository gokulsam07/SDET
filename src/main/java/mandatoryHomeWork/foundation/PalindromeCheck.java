package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheck {

	//Input: String 
	//Output : true or false
	//Logic:
	//1. Remove all the non-alpha numeric characters, covert to lower case, and to charArray
	//2. Instantiate a new char array of size of original char array after step1
	//3. initialize k=0;
	//4. Iterate through a for loop starting from index original size-1 and decremet the index till index>=0
	//5. store char from original array of index i to reversed char array of index k & increment k by1
	//6. check if original and reversed char array is equal

	public boolean isPalindrome(String str) {

		char[] lc = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

		char[] reversed = new char[lc.length];
		int k=0;
		for (int i = lc.length-1; i >=0; i--) {
			reversed[k]=lc[i];
			k++;
		}
		return Arrays.equals(lc, reversed);

	}

	@Test
	public void tst1() {
		Assert.assertEquals(true, isPalindrome("A man, a plan, a canal: Panama"));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(true, isPalindrome("Malayalam"));
	}

	@Test
	public void tst3() {
		Assert.assertEquals(true, isPalindrome(" "));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(true, isPalindrome("3Cat a tac3 "));
	}

	@Test
	public void tst5() {
		Assert.assertEquals(false, isPalindrome("3Cat a tac1 "));
	}
}

package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class FirstPalindrome {
	//Input: String[] of words
	//Output: any palindrome words if present
	//Logic:
	//1. Iterate the array in for each
	//2. Initialize String rev =" ";
	//3. In a indexed for loop, run the loop till the decremented index becomes >=0 to append the charAt(i) to rev
	//4. if rev equals the word in question return it 
	//5. else return "" at the end outside the loop

	public String checkPalindrome(String[] words) {

		for (String word : words) {
			String rev ="";
			for (int i = word.length()-1; i >=0 ; i--) {
				rev =rev+ word.charAt(i);
			}

			if(rev.equals(word)) {
				return word;
			}
		}
		return "";

	}
	@Test
	public void tst1() {
		Assert.assertEquals("ada", checkPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
	}
	@Test
	public void tst2() {
		Assert.assertEquals("racecar", checkPalindrome(new String[] {"notapalindrome","racecar"}));
	}
	@Test
	public void tst3() {
		Assert.assertEquals("", checkPalindrome(new String[] {"def","ghi"}));
	}

}

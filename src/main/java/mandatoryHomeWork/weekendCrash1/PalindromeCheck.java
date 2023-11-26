package mandatoryHomeWork.weekendCrash1;

import org.junit.Test;
import org.testng.Assert;

public class PalindromeCheck {
	@Test
	public void palTest() {
		Assert.assertEquals(false, checkPalindrome("Hi thi2S is A fo4"));
	}@Test
	public void palTest1() {
		Assert.assertEquals(true, checkPalindrome("thi2S is A fo*4of A S(i s2iht"));
	}
	@Test
	public void palTest2() {
		Assert.assertEquals(true, checkPalindrome("A man, a plan, a canal, Panama!"));
	}
	public boolean checkPalindrome(String s) {
		char[] arr = s.toCharArray();
		int i=0,j=arr.length-1;
		while(i<j) {
			if(Character.isLetterOrDigit(arr[i])&&Character.isLetterOrDigit(arr[j])&&(Character.toLowerCase(arr[i])==Character.toLowerCase(arr[j]))) {
				i++;j--;
			}
			else if(!Character.isLetterOrDigit(arr[i])) {
				i++;
			}
			else if(!Character.isLetterOrDigit(arr[j])) {
				j--;
			}
			else return false;
		}
		return true;
	}
}

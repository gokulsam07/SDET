package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceNumwithChar {

	//Input: String with num 
	//Output: replace num with the char of position with +num in the alphabet list
	//Logic:
	//1. Initialize String f
	//2. In a for loop, check if the given char in a string is a number using ASCII value of num
	//3. If yes, add s.charAt(i-1)+s.charAt(i)-48 to f 
	// 4. if not, add charAt i to f
	//5. return f
	public String replaceNum(String s) {
		String f ="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=48&&s.charAt(i)<=57) {

				f=f+(char)(s.charAt(i-1)+s.charAt(i)-48);
			}
			else {
				f=f+s.charAt(i);
			}

		}


		return f;
	}


	@Test
	public void tst1() {
		Assert.assertEquals("abcdef", replaceNum("a1c1e1"));
	}

	@Test
	public void tst2() {
		Assert.assertEquals("abbdcfdhe", replaceNum("a1b2c3d4e"));
	}
}

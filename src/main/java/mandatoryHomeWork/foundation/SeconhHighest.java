package mandatoryHomeWork.foundation;


import org.junit.Assert;
import org.junit.Test;

public class SeconhHighest {

	//Input: String with num and letter
	//Output: second highest num in the string, if not present -1
	//Logic: 
	//1. initialize h, sh
	//2. In a for loop, check if the char is >= '0' and <='9'
	//3. if yes, convert it to int by subtracting -'0' from it
	//4. check if it is > h, if yes, assign h to sh and digit to h
	//5. if the digit is less than h but > sh assign digit to sh
	//return sh outside for loop (to get -1 if there's no second highest)
	public int secondHighest(String s) {
		int h = -1;
		int sh = -1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int digit = ch - '0';
				if (digit > h) {
					sh = h;
					h = digit;
				} else if (digit < h && digit > sh) {
					sh = digit;
				}
			}
		}

		return sh;
	}

	@Test
	public void tst1() {
		Assert.assertEquals(-1, secondHighest("abc1111"));
	}
	@Test
	public void tst2() {
		Assert.assertEquals(2, secondHighest("dfa12321afd"));
	}
}

package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class Max69 {
	public int maxNum(int num) {
		//Input: Number with 6 and 9
		//Output: Max num 
		//Logic:
		//1. Convert the num to string to perform replaceFirst operation to change 6 to 9 (first 6 replacement alone will make it bigger)
		//2.  Convert it back to int and return

		return Integer.valueOf(String.valueOf(num).replaceFirst("6", "9"));
	}

	@Test
	public void tst1() {
		Assert.assertEquals(9969, maxNum(9669));	
	}
	@Test
	public void tst2() {
		Assert.assertEquals(9999, maxNum(9996));	
	}
	@Test
	public void tst3() {
		Assert.assertEquals(9999, maxNum(9999));	
	}

}

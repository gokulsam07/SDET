package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class GreaterThan60 {

	//Input: String array of passenger details
	//Output: count of passengers age
	//Logic: 
	//1. initialize counter
	//2. In a for each loop, loop through all the values of array to get the value of age from the string using parseInt 
	//3. if int >60 increment counter
	//4. return counter

	public int returnSenior(String[] people) {
		int count=0;
		for (String who : people) {
			if(Integer.parseInt(who.substring(11,13))>60) {
				count++;
			}
		}
		return count;
	}

	@Test
	public void tst1() {
		Assert.assertEquals(2, returnSenior(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
	}
	@Test
	public void tst2() {
		Assert.assertEquals(0, returnSenior(new String[] {"1313579440F2036","2921522980M5644"}));
	}
	@Test
	public void tst3() {
		Assert.assertEquals(0, returnSenior(new String[] {"7868190130M6022"}));
	}
}

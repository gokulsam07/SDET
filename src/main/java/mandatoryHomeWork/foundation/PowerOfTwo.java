package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfTwo {

	
//	Input: get the number
//	Output: true or false
//	Logic: 
//		Initialize count
//		Iterate the number in while loop to check if the reminder of number is not 0
//		if yes, it means it is not a power of 2 (because all the power of 2 will be divisible by 2) and increment count to 1
//		Divide the number /2 further to get the next quotient
		

	public boolean checkPower(int n) {
		 int count = 0;
	        while (n > 0) {
	            if (n % 2 != 0) {
	                count++;
	            }
	            n = n / 2;
	        }
	        return count == 1;

	}

	@Test
	public void tst1() {
		Assert.assertEquals(true, checkPower(16));	
	}
	
	@Test
	public void tst2() {
		Assert.assertEquals(false, checkPower(10));	
	}
	
	@Test
	public void tst3() {
		Assert.assertEquals(false, checkPower(3));	
	}
}

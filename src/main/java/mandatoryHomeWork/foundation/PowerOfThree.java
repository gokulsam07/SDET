package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThree {
	//	Input: get the number
	//	Output: true or false
	//	Logic: 
	//		Iterate the number in while loop to check if the number is >=3 
	//		if yes, check if the remainder is not eql to zero, if yes return false
	//		Divide the number /3 further to get the next quotient
	// return n==1, final number for power of 3 will be 1

	public boolean isPowerOfThree(int n) {

		while(n>=3){
			if(n%3!=0) { return false;}
			n=n/3;
		}
		return n==1;
	}


	@Test
	public void tst1() {
		Assert.assertEquals(false, isPowerOfThree(535));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(false, isPowerOfThree(0));
	}

	@Test
	public void tst3() {
		Assert.assertEquals(true, isPowerOfThree(27));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(false, isPowerOfThree(45));
	}

	@Test
	public void tst5() {
		Assert.assertEquals(true, isPowerOfThree(1));
	}
}

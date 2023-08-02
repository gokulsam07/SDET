package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrime {
	
//	input : number to check 
//	output : isPrime or not
//	Logic: if number is less than or eql to 1, it will not be prime
//	In a for loop, check if the number is divisble by the numbers less than the given number
//	since prime only divides by itself, if the number looping through has a perfect divisor, it means it is not prime
	


	public boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				return false;
			}

		}
		return true;
	}

	@Test
	public void test1(){
		Assert.assertEquals(true, isPrime(7));

	}
	@Test
	public void test2(){
		Assert.assertEquals(false, isPrime(4));

	}
	
	@Test
	public void test3(){
		Assert.assertEquals(false, isPrime(1));

	}
}

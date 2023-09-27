package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class SpyNumRedo {
	
	//ip: int
	//op:boolean
	//Logic
	//init pdt=1;sum=0
	//1. extract each num from digit using modulo and divide op
	//2. perform sum and pdt on each digit 
	// check the pdft and sum to return boolean
	
	//TC -O[N], SC - O[k]
	
	public boolean checkSpy(int num) {
		int pdt=1;
		int sum=0;
		while(num>0) {
			int rem = num%10;
			sum=sum+rem;
			pdt=pdt*rem;
			num=num/10;
		}
		return pdt==sum;
		
	}
	
	
	@Test
	public void test1() {
		Assert.assertEquals(true, checkSpy(22));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, checkSpy(121));
	}

	@Test
	public void test3() {
		Assert.assertEquals(false, checkSpy(500));
	}

	@Test
	public void test4() {
		Assert.assertEquals(false, checkSpy(1234));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(true, checkSpy(1241));
	}
}

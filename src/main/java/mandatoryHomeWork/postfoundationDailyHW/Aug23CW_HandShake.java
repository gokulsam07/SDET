package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;

public class Aug23CW_HandShake {
	
	//Input: int
	//Output: int
	//Logic
	//1. while n>0, add n-1 to sum, decrement n by 1
	//return sum

	public int handshake(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+n-1;
			n=n-1;
		}
		return sum;
	}
	

	@Test
	public void test1() {
		Assert.assertEquals(3, handshake(3));
	}
	
	@Test
	public void test2() {;
		Assert.assertEquals(0, handshake(1));
	}
	
	@Test
	public void test3() {;
		Assert.assertEquals(10, handshake(5));
	}
}

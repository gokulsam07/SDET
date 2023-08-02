package mandatoryHomeWork.foundation;


import org.junit.Assert;
import org.junit.Test;

public class AddNum {
	
//	Input: Get a positive num
//	Output: sum of the digits of num
//	Logic: 
//		1. initialzie sum var
//		2. In while loop run the palindrome logic to get the sum
//		3. if the sum is greater than 9, call the addNum method again using sum
//		4. else return sum


	public int addNum(int a) {
		int sum=0;
		while(a>0) {
			sum=sum+a%10;
			a=a/10;
		}
		if(sum>9) {
			return addNum(sum);
		}
		return sum;


	}

	@Test
	public void tst1() {
		Assert.assertEquals(5, addNum(329));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(1, addNum(199));
	}

	@Test
	public void tst3() {
		Assert.assertEquals(2, addNum(38));
	}
	
	@Test
	public void tst4() {
		Assert.assertEquals(0, addNum(0));
	}
}

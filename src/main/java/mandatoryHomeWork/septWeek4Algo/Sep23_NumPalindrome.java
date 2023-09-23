package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep23_NumPalindrome {


	//ip: String
	//op : boolean
	//Logic 
	//Take a copy of given num
	// Run a while loop till given ip>0
	// Take do sum*10 + rem to sum
	// reduce the num /10 
	//3 return copy==sum
	//Time complexity - O[N]

	public boolean isPalindrome(int num) {
		int copy = num;
		int sum=0;
		while(num>0) {
			int rem = num%10;
			sum=rem+sum*10;
			num=num/10;
		}
		return copy==sum;
	}
	@Test
	public void test1() {
		Assert.assertEquals(true, isPalindrome(1221));
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, isPalindrome(121));
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, isPalindrome(0));
	}
	@Test
	public void test5() {
		Assert.assertEquals(false, isPalindrome(1251));
	}

}

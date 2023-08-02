package mandatoryHomeWork.foundation;


import org.junit.Assert;
import org.junit.Test;

public class Palindrome {

//	Input: number
//	Output : true or false
//	Logic : 
//		1. In a while loop, run it till the number is >0
//		2. initialzie sum, num, check variables to zero
//		3. do this in while loop
//		rem = num%10; //to get remainder
//		sum=sum*10+rem; //reverse the digit
//		num=num/10; // to get the next remaning number for further iteration

	public boolean isPalindrome(int num) {
		int sum=0;
		int rem=0;
		int check =num;

		while(num>0) { //535 53 5 
			rem = num%10; //5 3 5
			sum=sum*10+rem; //53
			num=num/10; //5
		}
		return check==sum;

	}

	@Test
	public void tst1() {
		Assert.assertEquals(true, isPalindrome(535));
	}

	@Test
	public void tst2() {
		Assert.assertEquals(false, isPalindrome(321));
	}

	@Test
	public void tst4() {
		Assert.assertEquals(false, isPalindrome(-121));
	}
}

package mandatoryHomeWork.postfoundationDailyHW;

import org.junit.Test;
import org.testng.Assert;


public class Aug21CW {
	//Input : int
	///Output : boolean
	//Logic
	//1. reverse the num using modulo, sum*10+rem & divisor 
	//2. reverse the reversed number again in another method and check if the initial value and reverse 2 are equal
	//3. return yes if true, else return false


	public boolean reverse(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {  
			int rem = num%10;
			sum = sum*10+ rem;
			num=num/10;
		}
		return temp==reverse2(sum);
	}
	public int reverse2(int num) {
		int sum=0;
		while(num>0) {  
			int rem = num%10;
			sum = sum*10+ rem;
			num=num/10;
		}
		return sum;
	}


	@Test
	public void test1() {
		Assert.assertEquals(true, reverse(1202));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, reverse(12300));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, reverse(0));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, reverse(131));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(false, reverse(1000000));
	}

}

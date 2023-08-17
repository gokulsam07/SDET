package mandatoryHomeWork.postfoundationDailyHW;
import org.junit.Assert;
import org.junit.Test;



public class SpyNumber {

	//PseudoCode
	//Input: int
	//Output: boolean
	//Logic
	//Initialize sum =0 and product=1;
	//1. Extract each num from the given num and add to sum and mulityply with product
	//2. Run the loop till num >0
	//return sum==product


	public boolean isSpy(int num) {
		int sum=0;
		int product=1;
		if(num==0) return true;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		return sum==product;
	}


	@Test
	public void test1() {
		Assert.assertEquals(true, isSpy(132));
	}


	@Test
	public void test2() {
		Assert.assertEquals(false, isSpy(130));
	}


	@Test
	public void test3() {
		Assert.assertEquals(true, isSpy(1124));
	}


	@Test
	public void test4() {
		Assert.assertEquals(false, isSpy(1111));
	}
	@Test
	public void test5() {
		Assert.assertEquals(true, isSpy(0));
	}

	@Test
	public void test6() {
		Assert.assertEquals(true, isSpy(1));
	}


}

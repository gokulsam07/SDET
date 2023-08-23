package mandatoryHomeWork.postfoundationDailyHW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Aug23HW_ArrayPartition {
	//Input: int[]
	//Output: int
	//Logic:
	//1. Sort the array
	//2. Add all the even indexes
	//return the sum

	
	//Time complexity -- O[N/2] ~= O[N]
	public int maxSum(int[] a) {
		Arrays.sort(a);
		int maxSum =0;
		for (int i = 0; i < a.length; i+=2) {
			maxSum+=a[i];
		}
		return maxSum;
	}

	@Test
	public void test1() {
		Assert.assertEquals(4, maxSum(new int[] {1,4,3,2}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(9, maxSum(new int[] {6,2,6,5,1,2}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, maxSum(new int[] {1,2}));
	}

}

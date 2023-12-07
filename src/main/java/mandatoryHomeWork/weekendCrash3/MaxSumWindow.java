package mandatoryHomeWork.weekendCrash3;

import org.junit.Test;
import org.testng.Assert;

public class MaxSumWindow {

	// ip: int[]
	// op: int
	// Logic
	// 1. In one for loop add the value till window size
	// 2. Start from the place where window ends, reduce the i-windowsize and add
	// the next till last
	// if current > max assign curr to max
	// retutn max
	// TC: O(n); SC: O(1)

	@Test
	public void maxSumTest() {
		Assert.assertEquals(16, maxSum(new int[] { 1, 4, 5, 7, 2, 1 }, 3));
	}

	@Test
	public void maxSumTest2() {
		Assert.assertEquals(14, maxSum(new int[] { 0, -1, 4, 5, 6, -7, 3, -2 }, 4));
	}

	@Test
	public void maxSumTest3() {
		Assert.assertEquals(0, maxSum(new int[] { 1, 4, 5, 7, 2, 1 }, 9));
	}
	
	@Test
	public void maxSumTest4() {
		Assert.assertEquals(19, maxSum(new int[] { 10, 4, 5, 7, 2, 1 }, 3));
	}

	public int maxSum(int[] nums, int k) {
		if (k > nums.length)
			return 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if(i<k) {
				sum += nums[i];
			}
			else {
				sum = sum + nums[i] - nums[i - k];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}

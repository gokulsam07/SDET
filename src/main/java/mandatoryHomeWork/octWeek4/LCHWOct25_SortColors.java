package mandatoryHomeWork.octWeek4;

import org.junit.Assert;
import org.junit.Test;

public class LCHWOct25_SortColors {
	
	//ip & op: int[]
	//Logic : init left, right and mid pointer
	//1. Iterate while loop till mid pointer is lte right
		//2. if num in mid eqls 0, swap left & mid -- inc left & mid
		//3. if num in mid eqls 1, inc mid
		//4. all other case, swap mid and right, dec rigth
	//return int[]
	//TC :O[N];SC:O[k]

	public int[] sortColors(int[] nums) {
		int left = 0, mid = 0, right = nums.length - 1;
		while (mid <= right) {
			if (nums[mid] == 0) {
				swap(nums, left, mid);
				left++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, right);
				right--;
			}
		}
		return nums;
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] { 0, 0, 0, 1, 1, 2 }, sortColors(new int[] { 1, 0, 0, 0, 1, 2 }));
	}

	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] { 1,1,2,2,2 }, sortColors(new int[] { 1, 2,2, 1, 2 }));
	}

	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[] { 0,1,1,2,2 }, sortColors(new int[] { 0,1,1,2,2}));
	}

}

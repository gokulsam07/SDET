package mandatoryHoweWork.septAlgos;

import org.junit.Test;
import org.testng.Assert;

public class Sep22LCHW_Parity2 {
	//ip : int[]
	//op : int[]
	//Logic
	//1. Init pointer i=0; j=1;
	//2. Run a while lopp till i & j is less than arr length
	//if the even index has even num, inc index of i by 2
	//if the odd index has odd num, inc index of j by 2
	// 3. In all other scenarios, swap the number in odd and even positions
	//return nums

	//Time complexity - O[N]

	public int[] sortArrayByParity(int[] nums) {
		int i = 0;
		int j = 1;


		while (i < nums.length && j < nums.length) {
			if (nums[i] % 2 == 0) {
				i += 2;
			} else if (nums[j] % 2 != 0) {
				j += 2;
			} else {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}

		return nums;
	}

	@Test
	public void test1() {
		Assert.assertEquals(new int[] {4,1,2,3}, sortArrayByParity(new int[] {4,2,1,3}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(new int[] {0,1}, sortArrayByParity(new int[] {0,1}));
	}

	@Test
	public void test3() {
		Assert.assertEquals(new int[] {4,5,2,7}, sortArrayByParity(new int[] {4,2,5,7}));
	}
}

package mandatoryHomeWork.septWeek4Algo;

import org.junit.Test;
import org.testng.Assert;

public class Sep24_MaxConsecutive {
	//ip: int[]
	//op: int
	//Logic  : init right & left pointer, maxCount
	//Run a while loop till last element using right pointer
	//if the nums is 1 set maximum of right-left+1 and maxCount
	//else move left pointer to right+1
	//inc right by 1
	//return maxCount;

	//Time complexity - O[N], Space complexity - 0[1]


	public int findMaxConsecutiveOnes(int[] nums) {
		int right=0;
		int left=0;
		int maxCount=0;
		while(right<nums.length){
			if(nums[right]==1){
				maxCount = Math.max(maxCount, right-left+1);
			}
			else{
				left=right+1;
			}
			right++;
		}
		return maxCount;
	}

	@Test
	public void test(){
		Assert.assertEquals(3, findMaxConsecutiveOnes(new int[]{1,1,1,0,1,1}));
	}
	@Test
	public void test1(){
		Assert.assertEquals(3, findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
	}

	@Test
	public void test2(){
		Assert.assertEquals(2, findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
	}

	@Test
	public void test3(){
		Assert.assertEquals(0, findMaxConsecutiveOnes(new int[]{0,0,0}));
	}

	@Test
	public void test4(){
		Assert.assertEquals(3, findMaxConsecutiveOnes(new int[]{1,1,1}));
	}


}

package mandatoryHomeWork.novWeek3;

import org.junit.Test;
import org.testng.Assert;

public class CWNov20_maxSubArray {
	//ip: int[]
		//op : int
		//Logic = init currMax & max first val in nums[]
		//1. Iterate all elements
	//2. max of current iteration val & currMax+curr val to currMax
	//3. Max of max and currMax to max
	//return max
	
		
		//Time complexity - O(n), Space complexity - O(1)
		public int maxSubArray(int[] nums) {
			int currMax = nums[0];
	        int max = nums[0];
	        for (int i = 1; i < nums.length; i++) {
	        	currMax = Math.max(nums[i], currMax + nums[i]);
	        	max = Math.max(max, currMax);
	        }
	        return max;
		}
		
		@Test
		public void maxSubArrayTest(){
			Assert.assertEquals(6, maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		}
		@Test
		public void maxSubArrayTest1(){
			Assert.assertEquals(4, maxSubArray(new int[] {-1,-2,4,-5}));
		}

		@Test
		public void maxSubArrayTest2(){
			Assert.assertEquals(-2, maxSubArray(new int[] {-2,-3,-5}));
		}

}

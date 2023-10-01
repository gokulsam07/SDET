package mandatoryHomeWork.octWeek1Algo;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class TwoSumHMAlgo {
	//ip:int[], int
	//op : int[]
	//Logic : init HM<Int,Int>
	//1. Run a for loop iterating all the elements
	//2. Take the remainder of target - current iteration's element, check if HM contains the element as key
	//3. if yes return the value and index of current iteration
		//put the current value and index in HM
	//return epmpty int[] if no match
	//TC: O[N], SC:O[N]
	
	
	 public int[] twoSum(int[] nums, int target) {
	     HashMap<Integer,Integer> hm = new HashMap<>();
	     for(int i=0;i<nums.length;i++){
	         int remMatch = target - nums[i];
	         if(hm.containsKey(remMatch)){
	             return new int[]{hm.get(remMatch),i};
	         }
	         hm.put(nums[i],i);
	     }
	     return new int[] {0,0};
	    }
		@Test
		public void test1() {
			Assert.assertEquals(new int[] {1,3}, twoSum(new int[] {7,2,4,5,1},7));
		}

		@Test
		public void test2() {
			Assert.assertEquals(new int[] {0,1}, twoSum(new int[] {7,2,4,5,1},9));
		}

		@Test
		public void test3() {
			Assert.assertEquals(new int[] {0,0}, twoSum(new int[] {7,2,4,5,1},13));
		}
}

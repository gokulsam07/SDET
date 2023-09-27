package mandatoryHomeWork.septWeek4Algo;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class SetMismatchRedo {
	
	//ip : int
	//op : int[]
	//Logic - init set, dup, missing 
	//Run a for loop to check the duplicate elements using set contains, if yes assign to dup else just add 
	// Run one more for loop from 1 to n, when the set does not contain the value, it is missing so assign to missign and break

	//return dup and missing in form of int[]
	//TC - O[2N], SC - O[N]
	
	 public int[] findErrorNums(int[] nums) {
	       int dup = 0;
	       int missing =0;
	       HashSet<Integer> s = new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            if(s.contains(nums[i])){
	                dup = nums[i];
	            }
	            s.add(nums[i]);
	        }
	       for(int i = 1; i <= nums.length; i++){
	            if(s.contains(i) == false){
	                missing = i;
	                break;
	            }
	        }
	        return new int[] {dup,missing};
	    }
	 
	 @Test
		public void test1() {
			Assert.assertEquals(new int[] {2,3}, findErrorNums(new int[] {1,2,2,4}));
		}

		@Test
		public void test2() {
			Assert.assertEquals(new int[] {2,1}, findErrorNums(new int[] {2,2}));
		}

		@Test
		public void test3() {
			Assert.assertEquals(new int[] {0,1}, findErrorNums(new int[] {0,0}));
		}

}

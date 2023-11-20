package mandatoryHomeWork.weekendCrash;

import org.junit.Test;
import org.testng.Assert;

public class MaxConsZeroWithK {
	
	//ip: int[], int
	//op: int
	//Logic -- init two pointers left,right =0 & count =-1
	//result=0
	//1. Run while loop till right reaches last ele
	//2. if ele at idx right =0, assign count+1 to left & right to count
	//3. assign max of (rest,right-left+1) and inc right
	//return result
	
	@Test
	public void maxZeroTest() {
		Assert.assertEquals(6,maxZero(new int[] {1,1,1,0,0,0,1,1,1,1,0},2));
	}
	
	public int maxZero(int[] nums, int k) {
		int left=0, right = 0, result=0;
		int count =-1;
		while(right<nums.length){
			if(nums[right]==0) {
				left=count+1;
				count=right;
			}
			result=Math.max(result, right-left+1);
			right++;
		}
		return result;
	}

}

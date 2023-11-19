package mandatoryHomeWork.weekendCrash;

import org.junit.Test;
import org.testng.Assert;

public class MaxProduct {
	
	//ip: int[]
	//op: int
	//Logic --> init max and secMax -->-1,-2
	//1. Iterate thru all the elements 
	//2. If the current ele is > max assign previous max to secMax and current element to max
	//3. check if the current ele is > secMax, if yes, assign it to secMax
	//return (max-1) * (secMax-1);
	//TC:O(m); SC:O(1)
	
	@Test
	public void maxPdtTest() {
		Assert.assertEquals(12, maxProduct(new int[] {3,4,5,2}));
	}
	@Test
	public void maxPdtTest1() {
		Assert.assertEquals(16, maxProduct(new int[] {1,5,4,5}));
	}
	@Test
	public void maxPdtTest2() {
		Assert.assertEquals(12, maxProduct(new int[] {3,7}));
	}
	
	
	public int maxProduct(int[] nums) {
	       int max = -1, secMax=-2;
	       for(int i=0;i<nums.length;i++){
	           if(nums[i]>max){
	               secMax=max;
	               max=nums[i];
	           }
	           else if(nums[i]>secMax){
	               secMax=nums[i];
	           }
	       }
	       return (max-1) * (secMax-1);
	    }

}

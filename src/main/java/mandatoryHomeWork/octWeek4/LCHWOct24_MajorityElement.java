package mandatoryHomeWork.octWeek4;

import org.junit.Test;
import org.testng.Assert;

public class LCHWOct24_MajorityElement {
	//ip: int[]
	//op : int
	//Logic : init tempMax, count
	//1. Iterate all the elements, if count == 0, assign the element in iteration as tempMax
	//2. If the element in the iteration equals tempMax, inc count by 1
	//3. if not reduce count by 1
	//return tempMax
	//TC:O[N]; SC :O[N]
	 public int majorityElement(int[] nums) {
	        int tempMax=0;
	        int count =0;
	        for(int i=0;i<nums.length;i++){
	            if(count==0){
	                tempMax=nums[i];
	            }
	            if(tempMax==nums[i]){
	                count++;
	            }
	            else{
	                count--;
	            }
	        }
	        return tempMax;
	    }
	 
	 @Test
	 public void test()
	 {
		Assert.assertEquals(1, majorityElement( new int[]{0,0,0,1,1,1,1,1}));
	 }
	 @Test
	 public void test1()
	 {
		 Assert.assertEquals(-5, majorityElement( new int[]{-5,-5,-4,-4}));
	 }
	 @Test
	 public void test3()
	 {
		 Assert.assertEquals(1, majorityElement( new int[]{0,1,1}));
	 }
}

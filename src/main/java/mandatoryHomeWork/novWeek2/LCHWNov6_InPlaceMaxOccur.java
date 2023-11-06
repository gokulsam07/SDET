package mandatoryHomeWork.novWeek2;

import org.junit.Assert;
import org.junit.Test;

public class LCHWNov6_InPlaceMaxOccur {
	//ip: int[]: op:int
	//Logic
	//1. init count and temp as 0
	// 2. Loop thru all elements
		//3. if count == 0, set the current val to temp
		//4. if temp == current val inc count
		//5. else dec count
	//return temp
	//TC:O[n]; SC: O[k]
	 public int majorityElement(int[] nums) {
	        int count =0;
	        int temp=0;
	        for(int i=0;i<nums.length;i++){
	            if(count==0){
	                temp=nums[i];
	            }
	            if(temp==nums[i]){
	                count++;
	            }
	            else{
	                count--;
	            }
	        }
	        return temp;
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

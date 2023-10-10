package mandatoryHomeWork.octWeek2.LinkedList;

import org.junit.Test;
import org.testng.Assert;

public class CWOct10_SmallestThanCurrent {
	//ip: int[]; op: int[]
	//Logic : init arr for the same length as ip
	//Run two for loops to compare the smallest one (exclude the same index number in nested loop)
	// if the number is smaller than current, inc count by 1 and assign the value in op int[]
	// retun arr
	//TC: O[N2]; SC: O[N]
	
	
	 public int[] smallerNumbersThanCurrent(int[] nums) {
         int arr[] = new int[nums.length];
     for(int i = 0 ; i< nums.length; i++){
         int count =0 ;
         for(int j = 0;j < nums.length; j++){
             if(nums[i]>nums[j] && i!=j ){
                 count++;
             }
           }
        arr[i]= count;
     }
     return arr;
  }
	 
	 
	 @Test
	 public void test1() {
	 	Assert.assertEquals(new int[] {0,2,0,5,3,3}, smallerNumbersThanCurrent(new int[] {1,2,1,4,3,3}));
	 }
	 @Test
	 public void test2() {
		 Assert.assertEquals(new int[] {0}, smallerNumbersThanCurrent(new int[] {1}));
	 }

	 @Test
	 public void test3() {
		 Assert.assertEquals(new int[] {4,3,2,1,0}, smallerNumbersThanCurrent(new int[] {5,4,3,2,1}));
	 }

}

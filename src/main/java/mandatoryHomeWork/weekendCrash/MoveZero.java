package mandatoryHomeWork.weekendCrash;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZero {
	//ip & op: int[]
		//Logic -- int i=0
		//1. Loop thru the arr[], if the element is non zero, set to arr[i] & inc i by 1
		//2, start from 1 till len of arr to set zero for remaining 
		//return int[]
		//TC:O[N], SC: O[k]
		 public int[] moveZero(int[] nums) {
		        int i=0;
		        for(int num: nums){
		            if(num!=0){
		                nums[i]=num;
		                i++;
		            }
		        }

		        for( i=i;i<nums.length;i++){
		            nums[i]=0;
		        }
		        return nums;
		    }
			
			@Test
			public void test1() {
				Assert.assertEquals(new int[] {1,3,12,0,0}, moveZero(new int[] {0,1,0,3,12}));
			}
			@Test
			public void test2() {
				Assert.assertEquals(new int[] {3,12,0,0}, moveZero(new int[] {0,0,3,12}));
			}

			@Test
			public void test3() {
				Assert.assertEquals(new int[] {1,2,3,4,0,0,0}, moveZero(new int[] {1,0,2,0,3,0,4}));
			}

}
